package com.example.auebnb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

public class AboutUsActivityGior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_geor);

        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#7F1734"));
    }
}