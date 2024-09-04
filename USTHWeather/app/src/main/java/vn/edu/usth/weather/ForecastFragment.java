package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        LinearLayout layout = new LinearLayout(getContext());

        layout.setBackgroundColor(0x20FF0000);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        TextView tv = new TextView(getContext());
        tv.setText("Thursday");
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(34);

        ImageView iv = new ImageView(getContext());
        iv.setImageResource(R.drawable.ic_launcher_foreground);

        layout.addView(tv);
        layout.addView(iv);


        return layout;
    }
}