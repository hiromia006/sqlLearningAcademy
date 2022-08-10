package com.sqlLearningAcademy.restAssured.batchTwo.classes.test.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentsData {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("body")
    private String body;

    @JsonProperty("postId")
    private Integer postId;

    /**
     * No args constructor for use in serialization
     */
    public CommentsData() {
    }

    /**
     * @param id
     * @param postId
     * @param body
     */
    public CommentsData(Integer id, String body, Integer postId) {
        this.id = id;
        this.body = body;
        this.postId = postId;
    }

    public CommentsData(Integer postId, String body) {
        this.postId = postId;
        this.body = body;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getBody() {
        return body;
    }


    public void setBody(String body) {
        this.body = body;
    }


    public Integer getPostId() {
        return postId;
    }


    public void setPostId(Integer postId) {
        this.postId = postId;
    }

}