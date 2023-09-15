package com.adamweb.trialapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PeopleList extends AppCompatActivity {
        ImageView imageView;
        RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_list);
        imageView = findViewById(R.id.arrowBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
        List<ItemPeopleList> items = new ArrayList<>();
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));
        items.add(new ItemPeopleList("Adamu Ibrahim Ya'u", "Realadamweb@gmail.com",R.drawable.adampro));

        recyclerView = findViewById(R.id.listPeople);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(getApplicationContext(), items));
    }
}