package com.example.interview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.databinding.ItemDashboardBinding
import com.example.interview.model.DashboardModel

class DashboardAdapter : ListAdapter<DashboardModel, DashboardAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDashboardBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item= getItem(position)
        holder.bind(item)
    }
    inner class ViewHolder(private val binding: ItemDashboardBinding): RecyclerView.ViewHolder(binding.root) {
            fun bind(item: DashboardModel){
                binding.item=item
                Log.d("Dash","Image Id: ${item.imageid}, Name:${item.name}")
                binding.executePendingBindings()

            }
    }

    private class DiffCallback : DiffUtil.ItemCallback<DashboardModel>(){
        override fun areItemsTheSame(oldItem: DashboardModel, newItem: DashboardModel): Boolean {
            return oldItem.imageid == newItem.imageid
        }

        override fun areContentsTheSame(oldItem: DashboardModel, newItem: DashboardModel): Boolean {
            return oldItem == newItem
        }
    }
}