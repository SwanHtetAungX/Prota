package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

public class Favourite extends AppCompatActivity {

    RecyclerView favList;
    SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}
        favList=findViewById(R.id.recycleView);
        songAdapter=new SongAdapter(CreatePlaylist.favList);
        favList.setAdapter(songAdapter);
        favList.setLayoutManager(new LinearLayoutManager(this));
        SearchView searchView=findViewById(R.id.searchSongsInPlaylist);

        //To filer the recycleView by matching user input and the title of the song
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                songAdapter.getFilter().filter(s);
                return false; }});}

    //To remove all the items in the array
    public void removeAll(View view) {
        CreatePlaylist.favList.clear();
        songAdapter.notifyDataSetChanged();}
}
