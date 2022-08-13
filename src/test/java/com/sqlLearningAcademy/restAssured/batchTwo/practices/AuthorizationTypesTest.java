package com.sqlLearningAcademy.restAssured.batchTwo.practices;

import com.thedeanda.lorem.LoremIpsum;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthorizationTypesTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://apingweb.com";
        RestAssured.basePath = "/api";
    }

    @Test
    public void testRegister() {
        String name = LoremIpsum.getInstance().getTitle(2);
        String email = LoremIpsum.getInstance().getEmail();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("email", email);
        jsonObject.put("phone", "5555551234");
        jsonObject.put("password", "123456");
        jsonObject.put("password_confirmation", "123456");

        given()
                .contentType(ContentType.JSON)
                .body(jsonObject)
                .log().uri()
                .log().body()
                .when()
                .post("/register")
                .then()
                .log().body()
                .statusCode(201);


    }


    @Test
    public void testArticles() {
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerTokenFromLogin())
                .log().uri()
                .when()
                .get("/articles")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void testArticle() {
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerTokenFromLogin())
                .log().uri()
                .when()
                .get("/article/1")
                .then()
                .log().body()
                .statusCode(200);
    }

    public String getBearerTokenFromLogin() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "superman@gmail.com");
        jsonObject.put("password", "123456");

        return given()
                .contentType(ContentType.JSON)
                .body(jsonObject)
                .log().uri()
                .log().body()
                .when()
                .post("/login")
                .then()
//                .log().body()
                .statusCode(200)
                .extract().jsonPath().get("token");
    }


    @Test
    public void getUsersWithAuth() {
        given()
                .auth().basic("admin", "12345")
                .contentType(ContentType.JSON)
                .when()
                .get("/auth/users")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void getUsersWithoutAuth() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users")
                .then()
                .log().body()
                .statusCode(200);
    }
}
