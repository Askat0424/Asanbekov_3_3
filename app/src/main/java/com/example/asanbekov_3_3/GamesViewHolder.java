package com.example.asanbekov_3_3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

public class GamesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvGame;

    public GamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvGame = itemView.findViewById(R.id.tv_game);

    }
    public void bind(String game){
        tvGame.setText(game);
    }
}

