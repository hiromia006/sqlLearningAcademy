package com.sqlLearningAcademy.restAssured.batch3.pojo;

import com.sqlLearningAcademy.restAssured.batch3.BaseTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetArticles extends BaseTest {


    public String getToken() {
        String bearToken = given()
                .contentType(ContentType.JSON)
                .body(new LoginDemo("superman@gmail.com", "123456"))
                .log().body()
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .log().body()
                .extract().jsonPath().getString("token");


        System.out.println(bearToken);
        return bearToken;

    }

    @Test
    public void getArticle2() {
    given()
                .headers(
                        "Authorization",
                        "Bearer " + getToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .log().body()
                .when()
            .get("/articles")
                .then()
                .statusCode(200)
                .log().body();


    }



}
