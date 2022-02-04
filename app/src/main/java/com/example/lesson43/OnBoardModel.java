package com.example.lesson43;

public class OnBoardModel {
    private String title,description;
    private Integer imageView;

    public Integer getImageView() {
        return imageView;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public OnBoardModel(String title, String description, Integer imageView) {
        this.title = title;
        this.description = description;
        this.imageView = imageView;
    }
}

