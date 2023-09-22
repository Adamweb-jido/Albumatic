package com.adamweb.trialapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {


    ImageView imageView, peopleList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);



        imageView = view.findViewById(R.id.newsFeedIcon);
        imageView.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),  PeopleActivity.class);
            startActivity(intent);
        });

        peopleList = view.findViewById(R.id.peopleIcon);
        peopleList.setOnClickListener(view12 -> {
            Intent intent = new Intent(getActivity(),  PeopleList.class);
            startActivity(intent);
        });

        return view;
    }
}