package com.example.interview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.databinding.ItemDashboardBinding
import com.example.interview.model.DashboardModel

class DashboardAdapter(private val items: List<DashboardModel>) : RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDashboardBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item= items[position]
        holder.bind(item)
    }
    inner class ViewHolder(private val binding: ItemDashboardBinding): RecyclerView.ViewHolder(binding.root) {
            fun bind(item: DashboardModel){
                binding.item=item
                binding.executePendingBindings()

            }
    }
}