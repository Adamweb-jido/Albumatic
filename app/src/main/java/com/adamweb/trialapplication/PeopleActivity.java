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

public class PeopleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

     List<DataItem> items = new ArrayList<DataItem>();
     items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));
        items.add(new DataItem("Adam Ibrahim Yau", "Csc/01/19/0001", "Com/Chem", 2, R.drawable.photoalbum));

        recyclerView = findViewById(R.id.albumRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DataAdapter(getApplicationContext(), items));
    }
}