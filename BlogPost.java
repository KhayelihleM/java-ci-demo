package com.example.portfolio.model;

import java.time.LocalDateTime;

public class BlogPost {
    private String title;
    private String content;
    private LocalDateTime publishedAt;

    public BlogPost(String title, String content, LocalDateTime publishedAt) {
        this.title = title;
        this.content = content;
        this.publishedAt = publishedAt;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
    public LocalDateTime getPublishedAt() { return publishedAt; }
}
