package com.example.threescreenstaskbymark; // Ваш пакет

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView sclogo = findViewById(R.id.sclogo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_screen);

        sclogo.startAnimation(animation);
        Thread splashThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);

                    startActivity(intent);

                    finish();
                }
            }
        };
        splashThread.start();
    }
}