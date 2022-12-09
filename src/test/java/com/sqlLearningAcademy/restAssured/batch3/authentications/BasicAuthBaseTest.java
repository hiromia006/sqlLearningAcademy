package com.sqlLearningAcademy.restAssured.batch3.authentications;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class BasicAuthBaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://apingweb.com";
        RestAssured.basePath = "/api/auth";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
