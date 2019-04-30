package com.example.nishit.nestedspinner;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.nio.charset.MalformedInputException;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(i);

                // close this activity

               finish();

            }

        }, 4*1000); // wait for 5 seconds
    }
}
