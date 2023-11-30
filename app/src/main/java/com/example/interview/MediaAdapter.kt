package com.example.interview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView

sealed class MediaItem {
    data class Image(val imageResId: Int) : MediaItem()
    data class Video(val videoResId: Int) : MediaItem()
}

class MediaAdapter(private val mediaList: List<MediaItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.image_item -> MediaViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.image_item, parent, false)
            )
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MediaViewHolder -> holder.bind(mediaList[position])
        }
    }

    override fun getItemCount(): Int = mediaList.size

    override fun getItemViewType(position: Int): Int {
        return R.layout.image_item
    }

    class MediaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val videoView: VideoView = itemView.findViewById(R.id.videoView)
        private val playButton: ImageView = itemView.findViewById(R.id.playButton)
        private var isVideoPlaying = false

        init {
            // Set up click listener for the video view
            videoView.setOnClickListener {
                playButton.visibility = View.VISIBLE
                if (isVideoPlaying) {
                    videoView.pause()
                    isVideoPlaying = false
                }
            }

            // Set up click listener for the play button
            playButton.setOnClickListener {
                playButton.visibility = View.GONE
                videoView.start()
                isVideoPlaying = true
            }
        }

        fun bind(item: MediaItem) {
            when (item) {
                is MediaItem.Image -> {
                    imageView.visibility = View.VISIBLE
                    videoView.visibility = View.GONE
                    playButton.visibility = View.GONE
                    imageView.setImageResource(item.imageResId)
                }
                is MediaItem.Video -> {
                    imageView.visibility = View.GONE
                    videoView.visibility = View.VISIBLE
                    playButton.visibility = if (isVideoPlaying) View.GONE else View.VISIBLE

                    // Reset the VideoView to allow multiple playbacks
                    videoView.setOnPreparedListener { mediaPlayer ->
                        mediaPlayer.isLooping = true
                        if (isVideoPlaying) {
                            mediaPlayer.pause()
                        }
                    }
                    videoView.setVideoURI(
                        android.net.Uri.parse("android.resource://${itemView.context.packageName}/${item.videoResId}")
                    )
                }
            }
        }
    }
}