package com.sqlLearningAcademy.restAssured.batch3.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Article {
    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonProperty("picture")
    private String picture;


    public Article(String title, String body, String picture) {
        this.title = title;
        this.body = body;
        this.picture = picture;
    }
}
