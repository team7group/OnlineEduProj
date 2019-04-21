package com.group7.edu.entity;

public class FeedBackDTO extends SysFeedback{

    private String image;

    private int anonymous;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(int anonymous) {
        this.anonymous = anonymous;
    }
}
