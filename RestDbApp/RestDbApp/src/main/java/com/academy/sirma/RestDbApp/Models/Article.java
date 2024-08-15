package com.academy.sirma.RestDbApp.Models;

public class Article {

    private String title;
    private int id;
    private String content;
    private int userId;

    public Article(String title, int userId, String content, int id) {
        this.title = title;
        this.userId = userId;
        this.content = content;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
