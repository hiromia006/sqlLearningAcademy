package com.sqlLearningAcademy.restAssured.batchTwo.practices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostData {
    @JsonProperty("author")
    private String author;

    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;

    /**
     * No args constructor for use in serialization
     */
    public PostData() {
    }

    /**
     * @param author
     * @param title
     */
    public PostData(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public PostData(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
