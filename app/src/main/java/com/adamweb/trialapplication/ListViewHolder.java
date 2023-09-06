package com.adamweb.trialapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder {

    ImageView listImage;
    TextView name, emailAddress;
    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        listImage = itemView.findViewById(R.id.listImage);
        name = itemView.findViewById(R.id.listName);
        emailAddress = itemView.findViewById(R.id.emailAddress);
    }
}
