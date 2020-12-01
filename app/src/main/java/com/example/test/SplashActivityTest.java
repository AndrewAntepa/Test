package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivityTest extends AppCompatActivity {

    ImageView imagePicture;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_test);

        imagePicture = findViewById(R.id.image_picture);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        intent = new Intent(SplashActivityTest.this, start_page.class);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(intent);
                SplashActivityTest.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imagePicture.startAnimation(animation);
    }
}