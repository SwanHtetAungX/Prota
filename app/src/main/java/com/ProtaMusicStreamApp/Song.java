package com.ProtaMusicStreamApp;
//Creating Song Object
public class Song {
    private String id;
    private String title;
    private String artist;
    private int fileLink;
    private double songLength;
    private int drawable;
    private String backGroundColor;
    private String lyrics;


    //Create getter for each property to retrieve its value
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getFileLink() {
        return fileLink;
    }

    public double getSongLength() {
        return songLength;
    }

    public int getDrawable() {
        return drawable;
    }

    public String getBackGroundColor(){return backGroundColor;}

    public String getLyrics(){return lyrics;}



    //create a constructor for song class
    public Song(String id, String title, String artist, int fileLink, double songLength, int drawable, String backGroundColor, String lyrics) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.fileLink = fileLink;
        this.songLength = songLength;
        this.drawable = drawable;
        this.backGroundColor=backGroundColor;
        this.lyrics=lyrics;

    }

}
