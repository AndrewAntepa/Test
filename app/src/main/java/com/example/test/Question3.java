package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {
    RadioButton q3;
    Button button_answer;
    Intent intent;
    public static final String RESULT = "result";
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        button_answer = findViewById(R.id.bottom_answer);
        q3 = findViewById(R.id.q3_3);
        intent = new Intent(Question3.this, Question4.class);
        result = getIntent().getIntExtra(RESULT, 0);
    }

    public void answer(View v){
        if (q3.isChecked()) result++;
        intent.putExtra("result", result);
        startActivity(intent);
    }
}