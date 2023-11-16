package com.example.interview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.model.WeatherModel

class WeatherAdapter : ListAdapter<WeatherModel, WeatherAdapter.WeatherViewHolder>(WeatherDiffCallback()) {
    class WeatherViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val cityName : TextView = itemView.findViewById(R.id.cityNameTextView)
        val temp : TextView = itemView.findViewById(R.id.temperatureTextView)
        val description : TextView =itemView.findViewById(R.id.weatherDescriptionTextView)
        val windSpeed : TextView = itemView.findViewById(R.id.windSpeedTextView)
        val cloudText : TextView = itemView.findViewById(R.id.cloudsTextView)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): WeatherViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_city,parent,false)
        return WeatherViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val city = getItem(position)
        holder.cityName.text = city.name
        holder.temp.text = "${city.main.temp}℃"
        holder.description.text = city.weather[0].description
        holder.windSpeed.text = "Wind Speed : ${city.wind.speed} m/s"
        holder.cloudText.text = "Clouds : ${city.clouds.all}%"
    }

   private class WeatherDiffCallback : DiffUtil.ItemCallback<WeatherModel>(){
        override fun areItemsTheSame(oldItem: WeatherModel, newItem: WeatherModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: WeatherModel, newItem: WeatherModel): Boolean {
            return oldItem == newItem
        }

    }
}


