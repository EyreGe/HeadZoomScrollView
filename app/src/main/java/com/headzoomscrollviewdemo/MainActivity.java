package com.headzoomscrollviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv = (ImageView) findViewById(R.id.iv);
        HeadZoomScrollView dzsv = (HeadZoomScrollView) findViewById(R.id.dzsv);
        dzsv.setZoomView(iv);
        Glide.with(this).load("http://seopic.699pic.com/photo/50008/2836.jpg_wh1200.jpg").into(iv);
    }
}
