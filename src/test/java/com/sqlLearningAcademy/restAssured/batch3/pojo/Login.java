package com.sqlLearningAcademy.restAssured.batch3.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Login {
    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;


    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }



}
