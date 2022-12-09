package com.sqlLearningAcademy.restAssured.batch3.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @JsonProperty("email")
    public String email;

    @JsonProperty("name")
    public String name;

    @JsonProperty("age")
    public String age;

    @JsonProperty("image")
    public String image;

    /**
     * No args constructor for use in serialization
     */
    public User() {
    }

    /**
     * @param image
     * @param name
     * @param email
     * @param age
     */
    public User(String email, String name, String age, String image) {
        super();
        this.email = email;
        this.name = name;
        this.age = age;
        this.image = image;
    }

}