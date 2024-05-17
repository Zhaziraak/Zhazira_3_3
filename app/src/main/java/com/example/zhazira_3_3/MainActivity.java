package com.example.zhazira_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> colorsList = new ArrayList<>();
    private RecyclerView rvColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvColors = findViewById(R.id.rv_colors);
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Red");
        colorsList.add("Grey");
        colorsList.add("Yellow");
        colorsList.add("Blue");
        colorsList.add("Pink");

        ColorsAdapter colorsAdapter = new ColorsAdapter(colorsList);
        rvColors.setAdapter(colorsAdapter);

    }
}