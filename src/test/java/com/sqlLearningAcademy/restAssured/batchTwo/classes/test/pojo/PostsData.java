package com.sqlLearningAcademy.restAssured.batchTwo.classes.test.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostsData {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("author")
    private String author;

    /**
     * No args constructor for use in serialization
     */
    public PostsData() {
    }

    /**
     * @param author
     * @param id
     * @param title
     */
    public PostsData(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public PostsData(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

}