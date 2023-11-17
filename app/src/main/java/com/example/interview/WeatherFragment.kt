package com.example.interview

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.interview.dB.UserRepo
import com.example.interview.databinding.FragmentWeatherBinding
import com.example.interview.model.WeatherViewModel

class WeatherFragment : Fragment() {

    private lateinit var binding: FragmentWeatherBinding
    private lateinit var viewModel: WeatherViewModel
    private lateinit var cityListAdapter: WeatherAdapter
    private lateinit var userRepo: UserRepo
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentWeatherBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)

        val cityNameInput = binding.cityNameInput
        val searchButton = binding.searchButton
        val cityName = binding.cityNameTextView
        val temp = binding.temperatureTextView
        val description = binding.weatherDescriptionTextView
        val windSpeed = binding.windSpeedTextView
        val cloudText = binding.cloudsTextView
        val cityListRecyclerView = binding.cityListRecycleView

        cityListAdapter = WeatherAdapter()
        cityListRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = cityListAdapter
        }

        searchButton.setOnClickListener {
            val city = cityNameInput.text.toString()
            if (city.isNotEmpty()){
                viewModel.getWeather(city)
            }else{
                Toast.makeText(requireContext(),"Please Enter City",Toast.LENGTH_SHORT).show()
            }
        }
        viewModel.cityWeatherlist.observe(viewLifecycleOwner, Observer {
            it.let {
                cityListAdapter.submitList(it)
            }
        })
        userRepo = UserRepo(requireContext())
        sharedPreferences = requireActivity().getSharedPreferences("Pref", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("userEmail",null)
        val users = userEmail?.let { userRepo.getUserByEmail(it) }
        val currentCity = "${users?.address?.city}"
        viewModel.searchCity(currentCity)
        viewModel.weatherData.observe(viewLifecycleOwner, Observer {
            it?.let {
                cityName.text = it.name
                temp.text = "${it.main.temp}℃"
                description.text = it.weather[0].description
                windSpeed.text = "Wind Speed : ${it.wind.speed} m/s"
                cloudText.text = "Clouds : ${it.clouds.all}%"
            }
        })
        viewModel.errorMessage.observe(viewLifecycleOwner, Observer { errorMessage->
            errorMessage.let {
                showError(it)
            }
        })
    }
    private fun showError(message: String){
        binding.errorMsg.text= "Error : $message"
        binding.errorMsg.visibility = View.VISIBLE
    }
}