package com.sqlLearningAcademy.restAssured.batch3.tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Students extends BaseTest {

    @Test
    public void getStudentShouldSucceed() {
        given()
                .log().uri()
                .when()
                .get("/students")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void createStudentShouldSucceed() {
        String json = "{\"batchId\":1,\"name\":\"Ali Ahsan2\",\"contactNo\":\"0164646462\"}";
        given()
                .contentType(ContentType.JSON)
                .body(json)
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .log().body();

        given()
                .log().uri()
                .when()
                .get("/students")
                .then()
                .statusCode(200)
                .log().body();

    }
}
