package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);



    }
    //Onclick method to move to main activity
    public void moveToMainActivity(View view){
        Intent intent=new Intent(PlaylistActivity.this,MainActivity.class);
        startActivity(intent);
    }
    //Onclick method to move to search activity
    public void moveToSearchActivity(View view){
        Intent intent=new Intent(PlaylistActivity.this,SearchActivity.class);
        startActivity(intent);
    }
    //Onclick method to move to addSongs activity
    public  void addSongs(View view){
        Intent intent=new Intent(PlaylistActivity.this,CreatePlaylist.class);
        startActivity(intent);
    }
    //Onclick method to move to moveYourPlaylist activity
    public  void moveToYourPlaylist(View view){
        Intent intent=new Intent(PlaylistActivity.this,Favourite.class);
        startActivity(intent);
    }


}