package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class start_page extends AppCompatActivity {

    ImageButton enter;
    Intent intent, intent_about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        enter = findViewById(R.id.enter);
        intent = new Intent(start_page.this, MainActivity.class);
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
                intent_about = new Intent(start_page.this, AboutActivityTest.class);
                startActivity(intent_about);
                break;
        }
        return true;
    }

    public void enter(View v){
        startActivity(intent);
    }
}