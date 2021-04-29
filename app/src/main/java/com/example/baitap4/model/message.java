package com.example.baitap4.model;

public class message {
    private  int image;
    private String name, title,gio;

    public message() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public message(int image, String name, String title, String gio) {
        this.image = image;
        this.name = name;
        this.title = title;
        this.gio = gio;
    }
}
