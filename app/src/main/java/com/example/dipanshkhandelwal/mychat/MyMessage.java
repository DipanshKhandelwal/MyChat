package com.example.dipanshkhandelwal.mychat;

/**
 * Created by DIPANSH KHANDELWAL on 11-04-2017.
 */

public class MyMessage {

    private String text;
    private String name;
    private String time;
    private String photoUrl;
    private String dpUrl;

    public MyMessage(){
    }

    public MyMessage(String text, String name, String time, String photoUrl , String dpUrl){
        this.text = text;
        this.time = time;
        this.name = name;
        this.photoUrl = photoUrl;
        this.dpUrl = dpUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public String getDpUrl() {
        return dpUrl;
    }

    public void setDpUrl(String dpUrl) {
        this.dpUrl = dpUrl;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
