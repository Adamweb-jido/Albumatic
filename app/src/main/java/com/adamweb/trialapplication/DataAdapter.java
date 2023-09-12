package com.adamweb.trialapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {

    Context context;
    List<DataItem> items;

    public DataAdapter(Context context, List<DataItem> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DataViewHolder(LayoutInflater.from(context).inflate(R.layout.album_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
       holder.name.setText(items.get(position).getName());
        holder.admNo.setText(items.get(position).getAdmissionNumber());
        holder.comb.setText(items.get(position).getCombination());
        holder.phoneNo.setText(items.get(position).getPhoneNumber());
        holder.coverImage.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
