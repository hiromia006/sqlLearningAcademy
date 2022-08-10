package com.sqlLearningAcademy.restAssured.batchTwo.classes.test;

import com.sqlLearningAcademy.restAssured.batchTwo.classes.baseTest.BaseTest;
import com.sqlLearningAcademy.restAssured.batchTwo.classes.test.pojo.CommentsData;
import com.sqlLearningAcademy.restAssured.batchTwo.classes.test.pojo.PostsData;
import com.thedeanda.lorem.LoremIpsum;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CommentsTest extends BaseTest {

    @Test
    public void postCommentsWithHashMapShouldSucceed() {
        String body = LoremIpsum.getInstance().getTitle(5);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("postId", 1);
        hashMap.put("body", body);

        given()
                .header("Content-Type", "application/json")
                .body(hashMap)
                .log().uri()
                .log().body()
                .when()
                .post("/comments")
                .then()
                .statusCode(201)
                .log().body();
    }


    @Test
    public void postCommentsWithJsonShouldSucceed() {
        String body = LoremIpsum.getInstance().getTitle(5);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("postId", 1);
        hashMap.put("body", body);


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("postId", 1);
        jsonObject.put("body", body);


        given()
                .header("Content-Type", "application/json")
                .body(jsonObject)
                .log().uri()
                .log().body()
                .when()
                .post("/comments")
                .then()
                .statusCode(201)
                .log().body()
                .body("body", equalTo(body))
                .body("postId", equalTo(1));
    }

    @Test
    public void postCommentsShouldSucceed() {
        ValidatableResponse validatableResponse = given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200);

        int postId = validatableResponse.extract().jsonPath().getInt("[0].id");
        String body = LoremIpsum.getInstance().getTitle(5);


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("postId", postId);
        jsonObject.put("body", body);


        given()
                .header("Content-Type", "application/json")
                .body(jsonObject)
                .log().uri()
                .log().body()
                .when()
                .post("/comments")
                .then()
                .statusCode(201)
                .log().body()
                .body("body", equalTo(body))
                .body("postId", equalTo(postId));
    }

    @Test
    public void postComments2ShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(3);
        String author = LoremIpsum.getInstance().getName();

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("title", title);
        hashMap.put("author", author);

        ValidatableResponse validatableResponse = given()
                .body(hashMap)
                .contentType(ContentType.JSON)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(title))
                .body("author", equalTo(author));

        int postId = validatableResponse.extract().jsonPath().getInt("id");
        String body = LoremIpsum.getInstance().getTitle(8);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("postId", postId);
        jsonObject.put("body", body);


        given()
                .header("Content-Type", "application/json")
                .body(jsonObject)
                .log().uri()
                .log().body()
                .when()
                .post("/comments")
                .then()
                .statusCode(201)
                .log().body()
                .body("body", equalTo(body))
                .body("postId", equalTo(postId));
    }


    @Test
    public void postCommentsWithPojoShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(3);
        String author = LoremIpsum.getInstance().getName();

        ValidatableResponse validatableResponse = given()
                .body(new PostsData(title, author))
                .contentType(ContentType.JSON)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(title))
                .body("author", equalTo(author));

        int postId = validatableResponse.extract().jsonPath().getInt("id");
        String body = LoremIpsum.getInstance().getTitle(8);

        given()
                .header("Content-Type", "application/json")
                .body(new CommentsData(postId, body))
                .log().uri()
                .log().body()
                .when()
                .post("/comments")
                .then()
                .statusCode(201)
                .log().body()
                .body("body", equalTo(body))
                .body("postId", equalTo(postId));
    }


    @Test
    public void postCommentsWithPojoSeAndDeShouldSucceed() {
        String title = LoremIpsum.getInstance().getTitle(3);
        String author = LoremIpsum.getInstance().getName();

        ValidatableResponse validatableResponse = given()
                //Serialization
                .body(new PostsData(title, author))
                .contentType(ContentType.JSON)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().body()
                .body("title", equalTo(title))
                .body("author", equalTo(author));

        //Deserialization
        PostsData postsData = validatableResponse.extract()
                .jsonPath().getObject("", PostsData.class);

        int postId = postsData.getId();
        String body = LoremIpsum.getInstance().getTitle(8);

        given()
                .header("Content-Type", "application/json")
                .body(new CommentsData(postId, body))
                .log().uri()
                .log().body()
                .when()
                .post("/comments")
                .then()
                .statusCode(201)
                .log().body()
                .body("body", equalTo(body))
                .body("postId", equalTo(postId));
    }

    @Test
    public void testDeserializationShouldSucceed() {

        ValidatableResponse validatableResponse1 = given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .log().body();
        List<PostsData> postsDatas = validatableResponse1
                .extract().jsonPath().getList("", PostsData.class);

        System.out.println("===========================================================");
        for (PostsData postsData : postsDatas) {
            System.out.println(postsData.getId());
            System.out.println(postsData.getTitle());
        }


        ValidatableResponse validatableResponse2 = given()
                .when()
                .get("comments")
                .then()
                .statusCode(200)
                .log().body();
        List<CommentsData> commentsDatas = validatableResponse2
                .extract().jsonPath().getList("", CommentsData.class);

        System.out.println("===========================================================");
        for (CommentsData commentsData : commentsDatas) {
            System.out.println(commentsData.getBody());
        }
    }
}
