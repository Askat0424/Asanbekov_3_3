package com.example.asanbekov_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GamesViewHolder> {

    private ArrayList<String>gameList;

    public GameAdapter(ArrayList<String> gameList) {
        this.gameList = gameList;
    }


    @NonNull
    @Override
    public GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GamesViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_games,parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull GamesViewHolder holder, int position) {
         holder.bind(gameList.get(position));

    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }
}
