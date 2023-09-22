package com.adamweb.trialapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
     TextView forget, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
     forget = findViewById(R.id.forgetPassword);
     forget.setOnClickListener(view -> {
         Intent intent = new Intent(getApplicationContext(), ForgetPassActivity.class);
         startActivity(intent);
     });
     register = findViewById(R.id.register);
     register.setOnClickListener(view -> {
         Intent intent = (new Intent(getApplicationContext(), SignUpActivity.class));
         startActivity(intent);
     });
    }
}