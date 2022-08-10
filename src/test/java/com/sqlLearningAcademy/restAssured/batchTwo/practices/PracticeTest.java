package com.sqlLearningAcademy.restAssured.batchTwo.practices;

import com.sqlLearningAcademy.restAssured.batchTwo.classes.baseTest.BaseTest;
import com.thedeanda.lorem.LoremIpsum;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PracticeTest extends BaseTest {
    @Test
    public void postShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("title", title);
        hashMap.put("author", author);

        given()
                .header("Content-Type", "application/json")
//                .contentType(ContentType.JSON)
                .body(hashMap)
                .log().body()
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
    public void postPojoShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        given()
                .header("Content-Type", "application/json")
//                .contentType(ContentType.JSON)
                .body(new PostData(title, author))
                .log().body()
                .log().uri()
                .when()
                .post("/posts")
                .then()
                .log().body()
                .statusCode(201)
                .body("author", equalToIgnoringCase(author))
                .body("title", equalToIgnoringCase(title))
                .body("id", notNullValue());
    }


    @Test
    public void postPojoDesShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(4);
        String author = LoremIpsum.getInstance().getName();

        ValidatableResponse validatableResponse = given()
                .header("Content-Type", "application/json")
//                .contentType(ContentType.JSON)
                .body(new PostData(title, author))
                .log().body()
                .log().uri()
                .when()
                .post("/posts")
                .then()
                .log().body()
                .statusCode(201)
                .body("author", equalToIgnoringCase(author))
                .body("title", equalToIgnoringCase(title))
                .body("id", notNullValue());

        PostData postData = validatableResponse
                .extract().jsonPath().getObject("", PostData.class);

        System.out.println(postData.getTitle());
    }
}
