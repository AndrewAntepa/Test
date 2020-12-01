package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {
    RadioButton q4;
    Button button_answer;
    Intent intent;
    public static final String RESULT = "result";
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        q4 = findViewById(R.id.q5_4);
        button_answer = findViewById(R.id.button_answer);
        intent = new Intent(Question5.this, Result.class);
        result = getIntent().getIntExtra(RESULT, 0);
    }

    public void answer(View v){
        if (q4.isChecked()) result++;
        intent.putExtra("result", result);
        startActivity(intent);
    }
}