package com.sqlLearningAcademy.restAssured.batch3.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginDemo {
    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    public LoginDemo() {

    }

    public LoginDemo(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
