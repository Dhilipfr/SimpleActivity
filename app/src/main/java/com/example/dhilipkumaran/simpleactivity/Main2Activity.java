package com.example.dhilipkumaran.simpleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent();
        Toast.makeText(Main2Activity.this,i.getStringExtra("TestData"),Toast.LENGTH_LONG).show();
    }
}
