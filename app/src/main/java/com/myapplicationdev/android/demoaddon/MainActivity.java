package com.myapplicationdev.android.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView iv,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView)findViewById(R.id.iv);
        String imageUrl = "http://square.github.io/picasso/static/sample.png";

    }
}
