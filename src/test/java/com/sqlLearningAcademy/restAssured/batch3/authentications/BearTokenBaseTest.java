package com.sqlLearningAcademy.restAssured.batch3.authentications;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class BearTokenBaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://apingweb.com";
        RestAssured.basePath = "/api";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
