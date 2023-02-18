package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaySong extends AppCompatActivity {
    //creating some class variables and set initial values for them
    static ArrayList<Song> favList=new ArrayList<Song>();
    private String title="";
    private String artist="";
    private int fileLink;
    private int  songIndex;
    private Song song;
    private MediaPlayer player= new MediaPlayer();
    private double songLength;
    private int drawable;
    private int currentIndex;
    private SongCollection songCollection=new SongCollection();
    private String backGroundColor;
    Boolean repeatFlag=false;
    ImageButton playPauseBtn;
    SeekBar seekBar;
    Handler handler=new Handler();
    ImageButton repeatBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}
        Bundle SongIndex =this.getIntent().getExtras();
        currentIndex=SongIndex.getInt("index");
        playPauseBtn=findViewById(R.id.PlayPauseButton);
        seekBar=findViewById(R.id.seekBar);

        //to track the position of seekbar
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {}
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                    player.seekTo(seekBar.getProgress());
                    seekBar.setProgress(player.getCurrentPosition());}});

        repeatBtn=findViewById(R.id.repeatSong);
        displaySongBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playSong();}

    //to play song once the PlaySong Activity is initiated
    public void playSong(){
            player.start();
            //to set the seekbar based on the song duration
            seekBar.setMax(player.getDuration());
            handler.removeCallbacks(p_handler);
            handler.postDelayed(p_handler,1000);
            stopMusic();
            playPauseBtn.setImageResource(R.drawable.pause);}


    Runnable p_handler= new Runnable() {
        @Override
        //to show the seekbar according to the song position
        public void run() {
            if(player!=null && player.isPlaying()){
            seekBar.setProgress(player.getCurrentPosition());
            handler.postDelayed(this,1000);}}};


    //To display Song Based On the Song Index
    public void displaySongBasedOnIndex() {
        song=songCollection.getCurrentSong(currentIndex);
        title=song.getTitle();
        artist=song.getArtist();
        fileLink=song.getFileLink();
        drawable=song.getDrawable();
        backGroundColor=song.getBackGroundColor();
        TextView songTitle=findViewById(R.id.songTitle);
        songTitle.setText(title);
        TextView artistName=findViewById(R.id.artistName);
        artistName.setText(artist);
        ImageView playerImage=findViewById(R.id.imgPlayer);
        playerImage.setImageResource(drawable);
        ConstraintLayout songBackground =findViewById(R.id.songBackground);
        songBackground.setBackgroundColor(Color.parseColor(backGroundColor));}

    //Create Onclick method to play/pause song depending on if the player is playing
    public void playOrPause(View view) {
        if(player.isPlaying()){
            player.pause();
            playPauseBtn.setImageResource(R.drawable.play);}
        else{
            player.start();
            playPauseBtn.setImageResource(R.drawable.pause);}}

    //To stop the music when it ends and if repeat is clicked then play the music from the start
    public void stopMusic(){
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if(repeatFlag){
                    playOrPause(null);
                    seekBar.setProgress(player.getCurrentPosition());}
                else{playPauseBtn.setImageResource(R.drawable.play);
                    Toast.makeText(PlaySong.this, "The song has ended", Toast.LENGTH_LONG).show();}}});}

    //To play next song
    public void playNextSong(View view) {
        currentIndex=songCollection.skip(currentIndex);
        displaySongBasedOnIndex();
        ImageButton heartBtn=findViewById(R.id.heartButton);
        heartBtn.setImageResource(R.drawable.heartbutton);
        player=MediaPlayer.create(this,fileLink);
        playSong();}
    //To play prev song
    public void playPreviousSong(View view) {
        currentIndex=songCollection.prev(currentIndex);
        ImageButton heartBtn=findViewById(R.id.heartButton);
        heartBtn.setImageResource(R.drawable.heartbutton);
        displaySongBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playSong();}


    @Override
    //To stop the music when click back button
    public void onBackPressed() {
        super.onBackPressed();
        handler.removeCallbacks(p_handler);
        player.release();}

    //Create onclick method to add the current song to the Array called favlist
    public void addToFavouriteUsingHeartBtn(View view){
        Song songPosition=songCollection.getCurrentSong(currentIndex);
        CreatePlaylist.favList.add(songPosition);
        ImageButton heartBtn=findViewById(R.id.heartButton);
        heartBtn.setImageResource(R.drawable.heartstate);
        Toast.makeText(this, "Added to Playlist", Toast.LENGTH_SHORT).show();}

    //Create onclick method to move to lyrics activity and  send the data
    public void moveToLyrics(View view){
        Intent intent=new Intent(PlaySong.this,PlaySongWithLyrics.class);
        intent.putExtra("index",currentIndex);
        startActivity(intent);}

    //change to boolean value of repeatFlag  onclick
    public void repeatSongFn(View view) {
        if(repeatFlag){
            repeatBtn.setImageResource(R.drawable.loop);}
        else{
            repeatBtn.setImageResource(R.drawable.repeat);}
        repeatFlag=!repeatFlag;}
}


