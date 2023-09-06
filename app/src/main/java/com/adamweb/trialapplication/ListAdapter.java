package com.adamweb.trialapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    Context context;
    List<ItemPeopleList> items;


    public ListAdapter(Context context, List<ItemPeopleList> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(context).inflate(R.layout.item_people_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.emailAddress.setText(items.get(position).getEmail());
        holder.listImage.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
