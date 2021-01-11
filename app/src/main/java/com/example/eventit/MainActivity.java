package com.example.eventit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnlogin, btnrgister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.button);
        btnrgister = findViewById(R.id.button2);

        btnlogin.setOnClickListener(this);
        btnrgister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==btnlogin)
        {
            
        }
    }
}