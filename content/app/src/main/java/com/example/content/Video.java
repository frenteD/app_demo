package com.example.content;

public class Video {
    private String username;
    private int imageId;

    public Video(String username, int imageId){
        this.username=username;
        this.imageId=imageId;
    }

    public String getUserame(){
        return username;
    }
    public int getImageId(){
        return imageId;
    }

}
