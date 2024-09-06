package vn.edu.usth.weather;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherActivity", "App is created");
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ForecastFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "App is started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "App is resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "App is paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "App is stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "App is destroyed");
    }


}