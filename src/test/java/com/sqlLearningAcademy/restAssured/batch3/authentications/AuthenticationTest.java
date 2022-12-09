package com.sqlLearningAcademy.restAssured.batch3.authentications;

import com.sqlLearningAcademy.restAssured.batch3.pojo.Article;
import com.thedeanda.lorem.LoremIpsum;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import com.sqlLearningAcademy.restAssured.batch3.pojo.Login;

import static io.restassured.RestAssured.given;

public class AuthenticationTest extends BearTokenBaseTest {
    @Test
    public void loginShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .body(new Login("superman@gmail.com", "123456"))
                .log().uri()
                .log().body()
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .log().body();

    }

    @Test
    public void getArticlesShouldSucceed() {
        given()
                .headers(
                        "Authorization",
                        "Bearer " + getBearerToken(),
                        "Content-Type", ContentType.JSON)
                .log().uri()
                .when()
                .get("/articles")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void createArticleShouldSucceed() {
        given()
                .headers(
                        "Authorization",
                        "Bearer " + getBearerToken(),
                        "Content-Type", ContentType.JSON)
                .log().uri()
                .body(new Article(LoremIpsum.getInstance().getTitle(1), LoremIpsum.getInstance().getTitle(3), LoremIpsum.getInstance().getUrl()))
                .log().body()
                .when()
                .post("/article/create")
                .then()
                .statusCode(200)
                .log().body();
    }

    private String getBearerToken() {
        return given()
                .contentType(ContentType.JSON)
                .body(new Login("superman@gmail.com", "123456"))
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .extract().jsonPath().getString("token");
    }


}
