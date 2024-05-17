package com.example.zhazira_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorsAdapter extends RecyclerView.Adapter<ColorsViewHolder> {

    private ArrayList<String>colorsList;

    public ColorsAdapter(ArrayList<String> colorsList) {
        this.colorsList = colorsList;
    }

    @NonNull
    @Override
    public ColorsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ColorsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_colors, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ColorsViewHolder holder, int position) {
        holder.onBind(colorsList.get(position));

    }

    @Override
    public int getItemCount() {
        return colorsList.size();
    }
}
