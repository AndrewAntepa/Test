package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {
    CheckBox q1, q2, q3, q4;
    Intent intent_answer;
    public static final String RESULT = "result1";
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        q1 = findViewById(R.id.q2_1);
        q2 = findViewById(R.id.q2_2);
        q3 = findViewById(R.id.q2_3);
        q4 = findViewById(R.id.q2_4);
        result = getIntent().getIntExtra(RESULT, 0);
        intent_answer = new Intent(Question2.this, Question3.class);
    }

    public void answer(View v){
        if (q1.isChecked() && q2.isChecked() && q3.isChecked() && !q4.isChecked()) {
            result++;
        }
        intent_answer.putExtra("result", result);
        startActivity(intent_answer);
    }
}