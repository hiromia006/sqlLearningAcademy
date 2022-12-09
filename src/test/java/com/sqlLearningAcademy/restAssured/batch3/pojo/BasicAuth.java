package com.sqlLearningAcademy.restAssured.batch3.pojo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BasicAuth {

    @Test
    public void testng() {
        given()
                .auth().basic("admin", "12345")
                .when()
                .get("https://apingweb.com/api/auth/users")
                .then()
                .statusCode(200)
                .log().body();
    }
}
