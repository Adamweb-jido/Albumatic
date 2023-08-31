package com.adamweb.trialapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
     TextView forget, register;
    public void myButton(View v){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
     forget = (TextView) findViewById(R.id.forgetPassword);
     forget.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(getApplicationContext(), ForgetPassActivity.class);
             startActivity(intent);
         }
     });
     register = findViewById(R.id.register);
     register.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = (new Intent(getApplicationContext(), SignUpActivity.class));
             startActivity(intent);
         }
     });
    }
}