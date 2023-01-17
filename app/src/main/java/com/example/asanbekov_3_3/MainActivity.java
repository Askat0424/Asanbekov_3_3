package com.example.asanbekov_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String>gameList = new ArrayList<>();
    private RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle_view);

        loadData();
        GameAdapter gameAdapter = new GameAdapter(gameList);
        recyclerView.setAdapter(gameAdapter);
    }

    private void loadData() {
        gameList.add("PUBG");
        gameList.add("Mobile legends");
        gameList.add("Free Faire");
        gameList.add("Brawl Stars");
        gameList.add("Subway Surfers");
        gameList.add("Standoff");
        gameList.add("Call of Duty");
        gameList.add("FIFA");
        gameList.add("Gardenscapes");
        gameList.add("Pokemon Go");
        gameList.add("Among Us");
        gameList.add("Sonic Dash");
        gameList.add("Roblox");
        gameList.add("Car Parking");
    }
}