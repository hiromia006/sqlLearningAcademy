package com.sqlLearningAcademy.restAssured.batch6.test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class BaseBatch6Test {
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
        RestAssured.basePath = "";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
