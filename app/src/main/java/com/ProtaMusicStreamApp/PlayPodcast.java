package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class PlayPodcast extends AppCompatActivity {
    //creating variables and set initial values for them
    private String title="";
    private String creator="";
    private int fileLink;
    private MediaPlayer player= new MediaPlayer();
    private double podcastLength;
    private int drawable;
    private int currentIndex;
    private PodcastCollection podcastCollection=new PodcastCollection();
    private String backGround;
    ImageButton playPauseBtn;
    SeekBar seekBar;
    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_podcast);
        if(getSupportActionBar()!=null){getSupportActionBar().hide();}
        Bundle podcastIndex=this.getIntent().getExtras();
        currentIndex=podcastIndex.getInt("index");
        playPauseBtn=findViewById(R.id.podcastPlayPauseBtn);
        seekBar=findViewById(R.id.seekBar2);

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
               displayPodcastsBasedOnIndex();
               player=MediaPlayer.create(this,fileLink);
               playPodcast();
    }
    //To display Podcast Based On the Podcast Index
    public void displayPodcastsBasedOnIndex(){
        Podcast podcast=podcastCollection.getCurrentPodcast(currentIndex);
        title=podcast.getTitle();
        creator=podcast.getCreator();
        fileLink=podcast.getFileLink();
        drawable=podcast.getDrawable();
        backGround=podcast.getBackGround();
        TextView podcastTitle=findViewById(R.id.podcastTitle);
        podcastTitle.setText(title);
        TextView createName=findViewById(R.id.creatorName);
        createName.setText(creator);
        ImageView imagePodcastPlayer=findViewById(R.id.imgPodcastPlayer);
        imagePodcastPlayer.setImageResource(drawable);
        ConstraintLayout podcastBackground=findViewById(R.id.podcastBackground);
        podcastBackground.setBackgroundColor(Color.parseColor(backGround)); }


    Runnable p_bar=new Runnable() {
        @Override
        //to show the seekbar according to the song position
        public void run() {
            if(player!=null && player.isPlaying()){
                seekBar.setProgress(player.getCurrentPosition());
                handler.postDelayed(this,1000);}}};

    //to play podcast once the PlaySong Activity is initiated
    public void playPodcast(){
       player.start();
        seekBar.setMax(player.getDuration());
        handler.removeCallbacks(p_bar);
        handler.postDelayed(p_bar,1000);
        stopPodcastWhenEnd();
       playPauseBtn.setImageResource(R.drawable.pause);}

    //Create Onclick method to play/pause song depending on if the player is playing
    public void PodcastPlayOrPause(View view) {
        if(player.isPlaying()){
            player.pause();
            playPauseBtn.setImageResource(R.drawable.play);}
        else{
            player.start();
            playPauseBtn.setImageResource(R.drawable.pause);}}

    //To play next Podcast
    public void playNextPodcast(View view) {
        currentIndex=podcastCollection.skipPodcast(currentIndex);
        displayPodcastsBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playPodcast();}

    //To play previous Podcast
    public void playPreviousPodcast(View view) {
        currentIndex=podcastCollection.prevPodcast(currentIndex);
        displayPodcastsBasedOnIndex();
        player=MediaPlayer.create(this,fileLink);
        playPodcast();}

    //To stop when the podcast end
    public void stopPodcastWhenEnd(){
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(PlayPodcast.this, "The song has ended", Toast.LENGTH_LONG).show();
                playPauseBtn.setImageResource(R.drawable.play);}});}

    //To move to note taking activity
    public void noteTaking(View view){
        Intent intent=new Intent(this, NoteTaking.class);
        startActivity(intent);}
    //To stop the stop when back button is clicked
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        player.release();}}