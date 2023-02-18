package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Creating class variables
     SongCollection songCollection=new SongCollection();
     PodcastCollection podcastCollection=new PodcastCollection();

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to remove the action bar
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}}

    //create onclick method to get the id of the selected song
    public void handleSongSection(View view){
        String resourceId=getResources().getResourceEntryName(view.getId());
        int currentArrayIndex=songCollection.searchSongById(resourceId);
        sendDataToPlaySongActivity(currentArrayIndex);}

    //to move and send data to the PlaySong activity
    public void sendDataToPlaySongActivity(int index){
        Intent intent= new Intent(MainActivity.this,PlaySong.class);
        intent.putExtra("index",index);
        startActivity(intent);}

    //create onclick method to get the id of the selected podcasts and to move and send the data to PlayPodcast Activity
    public void handlePodcastSection(View view){
        String resourceId=getResources().getResourceEntryName(view.getId());
        int currentArrayIndex=podcastCollection.searchPodcastById(resourceId);
        Intent intent=new Intent(this,PlayPodcast.class);
        intent.putExtra("index",currentArrayIndex);
        startActivity(intent);}

    //Create onclick method to move the PlaylistActivity
    public void moveToPlaylistActivity(View view){
        Intent intent=new Intent(MainActivity.this, PlaylistActivity.class);
        startActivity(intent);}

    //Create onclick method to move to SearchActivity
    public void moveToSearchActivity(View view){
        Intent intent=new Intent(MainActivity.this,SearchActivity.class);
        startActivity(intent);}
}

