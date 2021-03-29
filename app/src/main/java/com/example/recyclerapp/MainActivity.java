package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecycleAdapter adapter;

    String monthName [] = {"Muharam","Safar","Rabic Al-Awal","Rabic Al-Thaani","Jamaad Al-Awal","Jamaad Al-Aakhar","Rajab","Sha'baan","Ramadan","Shawal","Zi Al-Qa'ada","Zi Al-Hija",
            "Muharam","Safar","Rabic Al-Awal","Rabic Al-Thaani","Jamaad Al-Awal","Jamaad Al-Aakhar","Rajab","Sha'baan","Ramadan","Shawal","Zi Al-Qa'ada","Zi Al-Hija"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleAdapter(this,monthName);
        recyclerView.setAdapter(adapter);
    }
}