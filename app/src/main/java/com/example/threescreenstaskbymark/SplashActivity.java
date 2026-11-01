package com.example.threescreenstaskbymark; // Ваш пакет

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

        // 1. Находим ImageView по ID, который вы дали картинке в разметке
        ImageView sclogo = findViewById(R.id.sclogo);

        // 2. Загружаем созданный файл анимации splash_screen.xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_screen);

        // 3. Запускаем анимацию на логотипе
        sclogo.startAnimation(animation);
    }
}