package com.adamweb.trialapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    MessagesFragment messagesFragment = new MessagesFragment();
    ProfileFragment profileFragment = new ProfileFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bottomNavigationView = findViewById(R.id.myBottomMenu);
        getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.homeTab:
                    getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, homeFragment).commit();
                    return true;

                case R.id.messagePass:
                    getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, messagesFragment).commit();
                    return true;

                case R.id.profile:
                    getSupportFragmentManager().beginTransaction().replace(R.id.myContainer, profileFragment).commit();
                    return true;
            }
            return false;
        });

    }
}