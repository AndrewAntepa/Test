package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton q1, q2, q3, q4;
    Button button_answer;
    Intent intent_answer, intent_about;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_answer = findViewById(R.id.bottom_answer);
        q1 =findViewById(R.id.q1_1);
        q2 =findViewById(R.id.q1_2);
        q3 =findViewById(R.id.q1_3);
        q4 =findViewById(R.id.q1_4);
        intent_answer = new Intent(MainActivity.this, Question2.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.exit_item:
                //TODO завершение активности
                finish();
                break;
                case R.id.about_menu:
                    //TODO переход на AboutActivity
                    intent_about = new Intent(MainActivity.this, AboutActivityTest.class);
                    startActivity(intent_about);
                    break;
        }
        return true;
    }

    public void answer(View v){
        if (q2.isChecked()) result++;
        intent_answer.putExtra("result1", result);
        startActivity(intent_answer);
    }
}