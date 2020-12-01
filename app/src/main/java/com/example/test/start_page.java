package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class start_page extends AppCompatActivity {

    ImageButton enter;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        enter = findViewById(R.id.enter);
        intent = new Intent(start_page.this, MainActivity.class);
    }

    public void enter(View v){
        startActivity(intent);
    }
}