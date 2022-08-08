package com.sqlLearningAcademy.restAssured.batchTwo.classes.baseTest;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://localhost:3000";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
