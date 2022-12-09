package com.sqlLearningAcademy.restAssured.batch3.authentications;

import com.thedeanda.lorem.LoremIpsum;
import io.restassured.http.ContentType;
import com.sqlLearningAcademy.restAssured.batch3.pojo.User;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BasicAuthenticationTest extends BasicAuthBaseTest {
    @Test
    public void getUserShouldSucceed() {
        given()
                .auth().basic("admin", "12345")
                .log().uri()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void createUserShouldSucceed() {
        given()
                .auth().basic("admin", "12345")
                .contentType(ContentType.JSON)
                .body(new User(LoremIpsum.getInstance().getEmail(), LoremIpsum.getInstance().getName(), "35", LoremIpsum.getInstance().getUrl()))
                .log().uri()
                .log().body()
                .when()
                .post("/user/create")
                .then()
                .statusCode(200)
                .log().body();
    }
}
