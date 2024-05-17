package com.example.zhazira_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ColorsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvColors;
    public ColorsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvColors = itemView.findViewById(R.id.tv_colors);
    }

    public void onBind (String colorsName){
        tvColors.setText(colorsName);
    }
}
