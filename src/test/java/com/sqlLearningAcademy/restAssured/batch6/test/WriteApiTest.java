package com.sqlLearningAcademy.restAssured.batch6.test;

import com.thedeanda.lorem.LoremIpsum;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class WriteApiTest extends BaseBatch6Test {

    @Test
    public void createPostShouldSucceed() {
        String json = "{\"title\":\"json-server2\",\"author\":\"typicode2\"}";
        given()
                .header("Content-Type", "application/json")
                .body(json)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body();
    }

    @Test
    public void createPostWithHashMapShouldSucceed() {
        HashMap<String, Object> jsHashMap = new HashMap<>();
        jsHashMap.put("title", LoremIpsum.getInstance().getTitle(2));
        jsHashMap.put("author", LoremIpsum.getInstance().getName());

        given()
                .header("Content-Type", "application/json")
                .body(jsHashMap)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body();
    }

    @Test
    public void createPostWithHashMapAssertionShouldSucceed() {
        String tittle = LoremIpsum.getInstance().getTitle(3);
        String authorName = LoremIpsum.getInstance().getName();

        HashMap<String, Object> jsHashMap = new HashMap<>();
        jsHashMap.put("title", tittle);
        jsHashMap.put("author", authorName);

        given()
                .header("Content-Type", "application/json")
                .body(jsHashMap)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue());
    }


    @Test
    public void createPostWithJsonShouldSucceed() {
        String tittle = LoremIpsum.getInstance().getTitle(3);
        String authorName = LoremIpsum.getInstance().getName();

        JSONObject jsObject = new JSONObject();
        jsObject.put("title", tittle);
        jsObject.put("author", authorName);


        given()
                .header("Content-Type", "application/json")
                .body(jsObject)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue());
    }

    @Test
    public void updatePostShouldSucceed() {
        String tittle = LoremIpsum.getInstance().getTitle(3);
        String authorName = LoremIpsum.getInstance().getName();

        HashMap<String, Object> jsHashMap = new HashMap<>();
        jsHashMap.put("title", tittle);
        jsHashMap.put("author", authorName);


        int id = given()
                .header("Content-Type", "application/json")
                .body(jsHashMap)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue())
                .extract().jsonPath().getInt("id");


        tittle = LoremIpsum.getInstance().getTitle(3);
        authorName = LoremIpsum.getInstance().getName();

        HashMap<String, Object> jsHashMap2 = new HashMap<>();
        jsHashMap2.put("title", tittle);
        jsHashMap2.put("author", authorName);

        given()
                .header("Content-Type", "application/json")
                .body(jsHashMap2)
                .log().uri()
                .log().body()
                .when()
                .put("/posts/" + id)
                .then()
                .statusCode(200)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue());

    }

    @Test
    public void updatePostSingleFieldShouldSucceed() {
        String tittle = LoremIpsum.getInstance().getTitle(3);
        String authorName = LoremIpsum.getInstance().getName();

        HashMap<String, Object> jsHashMap = new HashMap<>();
        jsHashMap.put("title", tittle);
        jsHashMap.put("author", authorName);


        int id = given()
                .header("Content-Type", "application/json")
                .body(jsHashMap)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue())
                .extract().jsonPath().getInt("id");


        authorName = LoremIpsum.getInstance().getName();
        HashMap<String, Object> jsHashMap2 = new HashMap<>();
        jsHashMap2.put("author", authorName);

        given()
                .header("Content-Type", "application/json")
                .body(jsHashMap2)
                .log().uri()
                .log().body()
                .when()
                .patch("/posts/" + id)
                .then()
                .statusCode(200)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue());

    }

    @Test
    public void deletePostShouldSucceed() {
        String tittle = LoremIpsum.getInstance().getTitle(3);
        String authorName = LoremIpsum.getInstance().getName();

        HashMap<String, Object> jsHashMap = new HashMap<>();
        jsHashMap.put("title", tittle);
        jsHashMap.put("author", authorName);


        int id = given()
                .header("Content-Type", "application/json")
                .body(jsHashMap)
                .log().uri()
                .log().body()
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(tittle))
                .body("author", equalTo(authorName))
                .body("id", notNullValue())
                .extract().jsonPath().getInt("id");


        given()
                .header("Content-Type", "application/json")
                .log().uri()
                .when()
                .delete("/posts/" + id)
                .then()
                .statusCode(200)
                .log().body();

    }

}
