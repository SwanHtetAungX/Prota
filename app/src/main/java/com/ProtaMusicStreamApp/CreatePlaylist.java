package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class CreatePlaylist extends AppCompatActivity {
    //creating class variables
    static ArrayList<Song> favList=new ArrayList<Song>();
    SharedPreferences sharedPreferences;
    private String songID;
    private SongCollection songCollection=new SongCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_playlist);
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}
        sharedPreferences =getSharedPreferences("playlist",MODE_PRIVATE);
        String albums=sharedPreferences.getString("list","");
        //To get the value from array if the array is not empty
        if (!albums.equals("")){
            TypeToken<ArrayList<Song>> token=new TypeToken<ArrayList<Song>>(){};
            Gson gson =new Gson();
            favList=gson.fromJson(albums,token.getType());}}

    //To add the song to the array and permanently store the array using share preferences
    public void addToFavourites(View view){
        songID=view.getContentDescription().toString();
        Song song=songCollection.searchById(songID);
        favList.add(song);
        Gson gson=new Gson();
        String json= gson.toJson(favList);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("list",json);
        editor.apply();}

    //To move to favourite activity
    public void moveToFavourite(View view){
        Intent intent=new Intent(CreatePlaylist.this, Favourite.class);
        startActivity(intent);}}