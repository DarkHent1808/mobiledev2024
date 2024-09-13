package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForecastAndWeatherFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast_and_weather, container, false);
        getChildFragmentManager().beginTransaction().add(R.id.container,new ForecastFragment()).commit();
        getChildFragmentManager().beginTransaction().replace(R.id.fragment_weather,new WeatherFragment()).commit();
        return view;
    }
}