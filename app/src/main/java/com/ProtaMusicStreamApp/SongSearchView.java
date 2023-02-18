package com.ProtaMusicStreamApp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SongSearchView extends RecyclerView.ViewHolder {
    public TextView txtTitle;
    public TextView txtArtist;
    public ImageView imgSearchSong;

    public SongSearchView(@NonNull View itemView) {
        super(itemView);
        txtArtist=itemView.findViewById(R.id.txtSearchSongArtist);
        txtTitle=itemView.findViewById(R.id.txtSearchSongTitle);
        imgSearchSong=itemView.findViewById(R.id.imgSearchSong);

    }
}
