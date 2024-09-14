package vn.edu.usth.weather;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPagerAdapter.addFragment(new ForecastAndWeatherFragment(),getString(R.string.Paris));
        viewPagerAdapter.addFragment(new ForecastAndWeatherFragment(),getString(R.string.Hanoi));
        viewPagerAdapter.addFragment(new ForecastAndWeatherFragment(),getString(R.string.London));
        viewPager2.setAdapter(viewPagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText(viewPagerAdapter.getTitle(position));
        }).attach();
        Log.i("WeatherActivity", "App is created");
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