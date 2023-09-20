package com.sqlLearningAcademy.restAssured.batch6.test;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPostsTest extends BaseBatch6Test {

    @Test
    public void getPostsShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void getPostDetailShouldSucceed(){
        given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("/posts/1")
                .then()
                .log().body()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("json-server"));
    }
}
