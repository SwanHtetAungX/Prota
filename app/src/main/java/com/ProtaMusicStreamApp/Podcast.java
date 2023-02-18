package com.ProtaMusicStreamApp;

public class Podcast {
    private String id;
    private String title;
    private String creator;
    private int fileLink;
    private double podcastLength;
    private int drawable;
    private String backGround;
    //create a constructor for podcast class
    public Podcast(String id, String title, String creator, int fileLink, double podcastLength, int drawable, String backGround) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.fileLink = fileLink;
        this.podcastLength = podcastLength;
        this.drawable = drawable;
        this.backGround=backGround;
    }

    //Create getter for each property to retrieve its value
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public int getFileLink() {
        return fileLink;
    }

    public double getPodcastLengthLength() {
        return podcastLength;
    }

    public int getDrawable() {
        return drawable;
    }

    public  String getBackGround(){return backGround; }





}