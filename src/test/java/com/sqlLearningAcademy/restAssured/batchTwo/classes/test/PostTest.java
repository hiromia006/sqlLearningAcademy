package com.sqlLearningAcademy.restAssured.batchTwo.classes.test;

import com.sqlLearningAcademy.restAssured.batchTwo.classes.baseTest.BaseTest;
import com.thedeanda.lorem.LoremIpsum;
import io.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostTest extends BaseTest {

    @Test
    public void postShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        jsonObject.put("author", author);

        given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().uri()
                .when()
                .post("/posts")
                .then()
                .log().body()
                .statusCode(201)
                .body("author", equalTo(author))
                .body("title", equalTo(title))
                .body("id", notNullValue());
    }


    @Test
    public void putShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        jsonObject.put("author", author);

        ValidatableResponse validatableResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().uri()
                .when()
                .post("/posts")
                .then()
                .log().body()
                .statusCode(201)
                .body("author", equalTo(author))
                .body("title", equalTo(title))
                .body("id", notNullValue());

        int id = validatableResponse.extract()
                .jsonPath().getInt("id");

        String title2 = LoremIpsum.getInstance().getTitle(4);
        String author2 = LoremIpsum.getInstance().getName();

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("title", title2);
        jsonObject2.put("author", author2);

        given()
                .header("Content-Type", "application/json")
                .body(jsonObject2.toString())
                .pathParam("id", id)
                .log().uri()
                .log().body()
                .when()
                .put("/posts/{id}")
                .then()
                .log().body()
                .statusCode(200)
                .body("author", equalTo(author2))
                .body("title", equalTo(title2))
                .body("id", notNullValue())
                .body("id", equalTo(id));
    }

    @Test
    public void putPostShouldSucceed() {
        ValidatableResponse validatableResponse = given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200);

        int id = validatableResponse.extract()
                .jsonPath().getInt("[0].id");
        System.out.println("id : " + id);

        String title2 = LoremIpsum.getInstance().getTitle(4);
        String author2 = LoremIpsum.getInstance().getName();

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("title", title2);
        jsonObject2.put("author", author2);

        given()
                .header("Content-Type", "application/json")
                .body(jsonObject2.toString())
                .pathParam("id", id)
                .log().uri()
                .log().body()
                .when()
                .put("/posts/{id}")
                .then()
                .log().body()
                .statusCode(200)
                .body("author", equalTo(author2))
                .body("title", equalTo(title2))
                .body("id", notNullValue())
                .body("id", equalTo(id));
    }


    @Test
    public void patchPostShouldSucceed() {
        ValidatableResponse validatableResponse = given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200);

        int id = validatableResponse.extract()
                .jsonPath().getInt("[0].id");
        System.out.println("id : " + id);

        String title2 = LoremIpsum.getInstance().getTitle(4);

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("title", title2);


        given()
                .header("Content-Type", "application/json")
                .body(jsonObject2.toString())
                .pathParam("id", id)
                .log().uri()
                .log().body()
                .when()
                .patch("/posts/{id}")
                .then()
                .log().body()
                .statusCode(200)
                .body("title", equalTo(title2))
                .body("id", notNullValue())
                .body("id", equalTo(id));
    }


    @Test
    public void patchShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        jsonObject.put("author", author);

        ValidatableResponse validatableResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().uri()
                .when()
                .post("/posts")
                .then()
                .log().body()
                .statusCode(201)
                .body("author", equalTo(author))
                .body("title", equalTo(title))
                .body("id", notNullValue());

        int id = validatableResponse.extract()
                .jsonPath().getInt("id");

        String title2 = LoremIpsum.getInstance().getTitle(4);

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("title", title2);


        given()
                .header("Content-Type", "application/json")
                .body(jsonObject2.toString())
                .pathParam("id", id)
                .log().uri()
                .log().body()
                .when()
                .patch("/posts/{id}")
                .then()
                .log().body()
                .statusCode(200)
                .body("title", equalTo(title2))
                .body("id", notNullValue())
                .body("id", equalTo(id));
    }


    @Test
    public void deleteShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        jsonObject.put("author", author);

        ValidatableResponse validatableResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().uri()
                .when()
                .post("/posts")
                .then()
                .log().body()
                .statusCode(201)
                .body("author", equalTo(author))
                .body("title", equalTo(title))
                .body("id", notNullValue());

        int id = validatableResponse.extract()
                .jsonPath().getInt("id");

        given()
                .header("Content-Type", "application/json")
                .pathParam("id", id)
                .log().uri()
                .log().body()
                .when()
                .delete("/posts/{id}")
                .then()
                .log().body()
                .statusCode(200);
    }


    @Test
    public void deletePostShouldSucceed() {
        ValidatableResponse validatableResponse = given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200);

        int id = validatableResponse.extract()
                .jsonPath().getInt("[0].id");
        System.out.println("id : " + id);

        given()
                .header("Content-Type", "application/json")
                .pathParam("id", id)
                .log().uri()
                .log().body()
                .when()
                .delete("/posts/{id}")
                .then()
                .log().body()
                .statusCode(200);
    }


}
