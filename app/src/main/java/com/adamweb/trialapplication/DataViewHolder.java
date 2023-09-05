package com.adamweb.trialapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {

    ImageView coverImage;
    TextView name, admNo, comb, phoneNo;
    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        coverImage = itemView.findViewById(R.id.albumCover);
        name = itemView.findViewById(R.id.yourName);
        admNo = itemView.findViewById(R.id.admNo);
        comb = itemView.findViewById(R.id.combination);
        phoneNo = itemView.findViewById(R.id.phoneNo);
    }
}
