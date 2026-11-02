package com.example.threescreenstaskbymark;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.threescreenstaskbymark.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnLogin.setOnClickListener(v -> {

            String username = binding.etEmail.getText().toString().trim();
            String password = binding.etPassword.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Error: the fields cannot be empty!", Toast.LENGTH_SHORT).show();
            }
            else if (username.equals("Akkerman") && password.equals("12345678")) {
                Toast.makeText(this, "Success! Login successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
            else {
                Toast.makeText(this, "Error: incorrect username or password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}