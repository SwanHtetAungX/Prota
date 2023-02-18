package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    static ArrayList<Song> songList=new ArrayList<Song>();
    private Song tempSong;
    private Podcast tempPodcast;
    SongCollection songCollection=new SongCollection();
    PodcastCollection podcastCollection=new PodcastCollection();
    RecyclerView allSongList;
    SearchSongAdapter searchSongAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}

        //To add the song into the array
        for (int i = 0; i < 6; i++) {
            tempSong=songCollection.getCurrentSong(i);
            songList.add(tempSong);}



        allSongList=findViewById(R.id.recycleview1);
        searchSongAdapter=new SearchSongAdapter(songList);
        allSongList.setAdapter(searchSongAdapter);
        allSongList.setLayoutManager(new LinearLayoutManager(this));
        SearchView searchView =findViewById(R.id.searchViewSong);

        //To filer the recycleView by matching user input and the title of the song
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchSongAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }
    //To move to main activity
    public void moveToMainActivity(View view){
        Intent intent=new Intent(SearchActivity.this,MainActivity.class);
        startActivity(intent);}

    //To move to playlist activity
    public void moveToPlaylistActivity(View view){
        Intent intent=new Intent(SearchActivity.this,PlaylistActivity.class);
        startActivity(intent);
    }
}