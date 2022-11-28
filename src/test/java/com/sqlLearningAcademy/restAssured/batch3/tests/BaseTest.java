package com.sqlLearningAcademy.restAssured.batch3.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://localhost:3000";
//        RestAssured.port = 3000;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
