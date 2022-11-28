package com.sqlLearningAcademy.restAssured.batch3.tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BatchTest extends BaseTest {
    @Test
    public void getBatchShouldSucceed() {
        given()
                .log().uri()
                .contentType(ContentType.JSON)
                .when()
                .get("/batch")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void getBatchDetailShouldSucceed() {
        given()
                .when()
                .get("batch/1")
                .then()
                .statusCode(200);
    }

}
