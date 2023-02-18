package com.ProtaMusicStreamApp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyView extends RecyclerView.ViewHolder {
    //creating class variables
    public TextView txtPlaylistTitle;
    public TextView txtPlaylistArtist;
    public ImageView imgAddPlaylist;
    public Button removePlaylistBtn;
    public MyView(@NonNull View itemView) {
        super(itemView);
        txtPlaylistArtist=itemView.findViewById(R.id.txtPlaylistArtist);
        txtPlaylistTitle=itemView.findViewById(R.id.txtPlaylistTitle);
        imgAddPlaylist=itemView.findViewById(R.id.imgAddPlaylist);
        removePlaylistBtn=itemView.findViewById(R.id.removePlaylistBtn);
    }
}
