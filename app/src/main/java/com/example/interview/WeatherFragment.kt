package com.example.interview

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.interview.dB.UserRepo
import com.example.interview.databinding.FragmentWeatherBinding
import com.example.interview.model.WeatherViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class WeatherFragment : Fragment() {

    private lateinit var binding: FragmentWeatherBinding
    private lateinit var viewModel: WeatherViewModel
    private lateinit var cityListAdapter: WeatherAdapter
    private lateinit var userRepo: UserRepo
    private lateinit var sharedPreferences: SharedPreferences
    private val Location_Permission_Request = 123
    private lateinit var fusedLocation : FusedLocationProviderClient
    private var locationUpdatesReq = false

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

        fusedLocation = LocationServices.getFusedLocationProviderClient(requireActivity())

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
        viewModel.getWeather(currentCity)
        viewModel.weatherData.observe(viewLifecycleOwner, Observer {
            it?.let {
                cityName.text = it.name
                temp.text = "${it.main.temp}℃"
                description.text = it.weather[0].description
                windSpeed.text = "Wind Speed : ${it.wind.speed} m/s"
                cloudText.text = "Clouds : ${it.clouds.all}%"
            }
            binding.errorMsg.visibility = View.GONE
        })
        viewModel.liveData.observe(viewLifecycleOwner, Observer {
            it?.let {
                cityName.text = it.name
                temp.text = "${it.temp}℃"
                description.text = it.description
                windSpeed.text = "Wind Speed : ${it.speed} m/s"
                cloudText.text = "Clouds : ${it.all}%"
            }
        })
        viewModel.errorMessage.observe(viewLifecycleOwner, Observer { errorMessage->
            errorMessage.let {
                showError(it)
            }
        })
        binding.liveLocation.setOnClickListener {
            requestLocationPermission()
        }
    }
    private fun showError(message: String){
        binding.errorMsg.text= "Error : $message"
        binding.errorMsg.visibility = View.VISIBLE
        binding.cityListRecycleView.visibility = View.GONE
        binding.cityNameTextView.visibility = View.GONE
        binding.cloudsTextView.visibility = View.GONE
        binding.weatherDescriptionTextView.visibility = View.GONE
        binding.windSpeedTextView.visibility = View.GONE
        binding.temperatureTextView.visibility = View.GONE
    }

    //new for livelocation
    private fun requestLocationPermission(){
        if(ContextCompat.checkSelfPermission(requireContext(),android.Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){
            if (!locationUpdatesReq) {
                binding.cityNameInput.text.clear()
                getLiveLocation()
            }
        }else{
            requestPermissions(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),Location_Permission_Request)
        }
    }

    //new for livelocation
    private fun onRequestPermissions(requstCode :Int,permissions : Array<out String>, grantResults :IntArray){
        if (requstCode == Location_Permission_Request){
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                getLiveLocation()
            }else{
                Toast.makeText(requireContext(),"Location permission denied. Cannot show live location.",Toast.LENGTH_SHORT).show()
            }
        }
    }

    //new for livelocation
    @SuppressLint("MissingPermission")
    private fun getLiveLocation(){
        fusedLocation.lastLocation.addOnSuccessListener { location: Location ->
            if (location!=null){
                Log.d("LocationUpdate","latitude :${location.latitude} and longitude : ${location.longitude}")
                val latitude = location.latitude
                val longitude = location.longitude
                viewModel.searchCityByCoordnates(latitude,longitude)
            }
        }.addOnFailureListener { e->
            Toast.makeText(requireContext(),"Failed to get live location: ${e.message}",Toast.LENGTH_SHORT).show()
        }
    }
}