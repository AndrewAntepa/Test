package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView text;
    Intent intent;
    public static final String RESULT = "result";
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text = findViewById(R.id.ready);
        intent = new Intent(Result.this, start_page.class);
        result = getIntent().getIntExtra(RESULT, 0);
    }

    public void click(View v){
        text.setText(result +"/5");
    }

    public void again(View v){
        startActivity(intent);
    }
}