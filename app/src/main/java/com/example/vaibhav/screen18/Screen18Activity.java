package com.example.vaibhav.screen18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Screen18_Adapter;
import model.Screen18_Model;

public class Screen18Activity extends AppCompatActivity {

    private Integer img[] = {R.drawable.men, R.drawable.men, R.drawable.men,
            R.drawable.men, R.drawable.men, R.drawable.men};

    private RecyclerView recyclerView;
    private ArrayList<Screen18_Model> screen18_models;
    private Screen18_Adapter screen18_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen18);

        recyclerView = findViewById(R.id.dinner);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Screen18Activity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        screen18_models = new ArrayList<>();

        for (int i = 0; i < img.length; i++) {
            Screen18_Model ab = new Screen18_Model(img[i]);
            screen18_models.add(ab);
        }
        screen18_adapter = new Screen18_Adapter(Screen18Activity.this, screen18_models);
        recyclerView.setAdapter(screen18_adapter);
    }
}