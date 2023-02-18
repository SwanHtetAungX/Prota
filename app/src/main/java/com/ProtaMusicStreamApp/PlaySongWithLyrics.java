package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaySongWithLyrics extends AppCompatActivity {
    SongCollection songCollection=new SongCollection();
    //creating class variables;
    private Song song;
    private String title="";
    private String artist="";
    private int fileLink;
    private int drawable;
    private String backGroundColor;
    private  String lyrics;
    private int currentIndex;
    private MediaPlayer player= new MediaPlayer();
    ImageButton playPauseBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}
        setContentView(R.layout.activity_play_song_with_lyrics2);
        Bundle SongIndex =this.getIntent().getExtras();
        currentIndex=SongIndex.getInt("index");
        playPauseBtn1 = findViewById(R.id.playPauseBtn1);
        displaySongBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playSong();



    }
    //To display the song based on the index
    public void displaySongBasedOnIndex() {
        song=songCollection.getCurrentSong(currentIndex);
        title=song.getTitle();
        artist=song.getArtist();
        fileLink=song.getFileLink();
        drawable=song.getDrawable();
        lyrics=song.getLyrics();
        backGroundColor=song.getBackGroundColor();
        TextView songTitle=findViewById(R.id.txtLyricsTitle);
        songTitle.setText(title);
        TextView artistName=findViewById(R.id.txtLyricsArtist);
        artistName.setText(artist);
        ImageView playerImage=findViewById(R.id.imgLyricsPlayer);
        playerImage.setImageResource(drawable);
        TextView songLyrics=findViewById(R.id.songLyrics);
        songLyrics.setText(lyrics);
        ConstraintLayout lyricsBackground =findViewById(R.id.lyricsBackground);
        lyricsBackground.setBackgroundColor(Color.parseColor(backGroundColor)); }

    //To play the song once the activity is instantiated
    public void playSong(){
        player.start();
        playPauseBtn1.setImageResource(R.drawable.tworect);}

    //onclick method to play/pause the song depending on if the song is playing
    public void playOrPause1(View view) {
        if(player.isPlaying()){
            player.pause();
            playPauseBtn1.setImageResource(R.drawable.playtri);}
        else{
            player.start();
            playPauseBtn1.setImageResource(R.drawable.tworect); }
    }

    //To play next song
    public void playNextSongLyrics(View view) {
        currentIndex=songCollection.skip(currentIndex);
        displaySongBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playSong();
    }
    //To play previous song
    public void playPreviousSongLyrics(View view) {
        currentIndex=songCollection.prev(currentIndex);
        displaySongBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playSong();}}