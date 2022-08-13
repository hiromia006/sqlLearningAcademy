package com.sqlLearningAcademy.restAssured.batchTwo.classes.test;

import com.thedeanda.lorem.LoremIpsum;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthorizationTypeTest {

    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = "https://apingweb.com";
        RestAssured.basePath = "/api";
    }

    @Test
    public void modifyVOListShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("https://erpdevelopment.brac.net/node/scapir/VOListModified?BranchCode=2332&ProjectCode=015&UpdatedAt=2022-01-01 01:01:59&BusinessDate=2022-03-16&key=5d0a4a85-df7a-scapi-bits-93eb-145f6a9902ae")
                .then()
                .statusCode(200)
                .log().body();

    }

    @Test
    public void modifyVOListShouldFail() {
        given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("https://erpdevelopment.brac.net/node/scapir/VOListModified?BranchCode=2332&ProjectCode=015&UpdatedAt=2022-01-01 01:01:59&BusinessDate=2022-03-16&key=5d0a4a85-df7a-scapi-aaaa-93eb-145f6a9902ae")
                .then()
                .statusCode(401);

    }

    @Test
    public void bearerToken() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "superman@gmail.com");
        jsonObject.put("password", "123456");


        given()
                .body(jsonObject)
                .contentType(ContentType.JSON)
                .when()
                .post("/login")
                .then()
                .log().body();

    }


    public String getBearerToken() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "superman@gmail.com");
        jsonObject.put("password", "123456");

//        ValidatableResponse validatableResponse = given()
//                .body(jsonObject)
//                .contentType(ContentType.JSON)
//                .when()
//                .post("/login")
//                .then()
//                .statusCode(200);
//
//        String token = validatableResponse.extract().jsonPath().getString("token");
//        return token;

        return given()
                .body(jsonObject)
                .contentType(ContentType.JSON)
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .extract().jsonPath().getString("token");

    }

    @Test
    public void getArticlesShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerToken())
                .log().uri()
                .when()
                .get("/articles")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void createArticleShouldSucceed() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", LoremIpsum.getInstance().getTitle(5));
        jsonObject.put("body", LoremIpsum.getInstance().getParagraphs(1, 1));
        jsonObject.put("picture", "https://dummyimage.com/300x300&text=" + LoremIpsum.getInstance().getFirstName());

        given()
                .body(jsonObject)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerToken())
                .log().uri()
                .when()
                .post("/article/create")
                .then()
                .log().body()
                .statusCode(200)
                .body("message", equalTo("Article has been created"))
                .body("success", equalTo(true));
    }

    @Test
    public void deleteAnyArticleShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerToken())
                .log().uri()
                .when()
                .delete("/article/delete/50")
                .then()
                .log().body()
                .statusCode(200)
                .body("message", equalTo("Article has been deleted"))
                .body("success", equalTo(true));
    }


    @Test
    public void deleteLastArticleShouldSucceed() {
        int id = given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerToken())
                .log().uri()
                .when()
                .get("/articles")
                .then()
                .statusCode(200)
                .log().body()
                .extract().jsonPath().getInt("result[-1].id");

        System.out.println("Id =: " + id);

        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + getBearerToken())
                .log().uri()
                .when()
                .delete("/article/delete/" + id)
                .then()
                .log().body()
                .statusCode(200)
                .body("message", equalTo("Article has been deleted"))
                .body("success", equalTo(true));
    }

    @Test
    public void getUsersShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .auth().basic("admin", "12345")
                .log().uri()
                .when()
                .get("/auth/users")
                .then()
                .log().body();
    }

    @Test
    public void getUsersShouldFail() {
        given()
                .contentType(ContentType.JSON)
                .auth().basic("admin", "12345678")
                .log().uri()
                .when()
                .get("/auth/users")
                .then()
                .log().body();
    }
}
