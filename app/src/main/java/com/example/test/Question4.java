package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question4 extends AppCompatActivity {
    CheckBox q1, q2, q3, q4;
    Button button_andwer;
    Intent intent;
    public static final String RESULT = "result";
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        button_andwer = findViewById(R.id.button_answer);
        q1 = findViewById(R.id.q4_1);
        q2 = findViewById(R.id.q4_2);
        q3 = findViewById(R.id.q4_3);
        q4 = findViewById(R.id.q4_4);
        intent = new Intent(Question4.this, Question5.class);
        result = getIntent().getIntExtra(RESULT, 0);
    }

    public void answer(View v){
        if (q1.isChecked() && q3.isChecked() && !q2.isChecked() && !q4.isChecked())
            result++;
        intent.putExtra("result", result);
        startActivity(intent);
    }
}