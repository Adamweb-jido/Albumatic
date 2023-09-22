package com.adamweb.trialapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PeopleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView arrowBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        arrowBack = findViewById(R.id.backArrow);
        arrowBack.setOnClickListener(view -> {
           Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
           startActivity(intent);
        });
     List<DataItem> items = new ArrayList<>();
     items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", "+2348160807055", R.drawable.photoalbum));

        recyclerView = findViewById(R.id.albumRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DataAdapter(getApplicationContext(), items));
    }
}