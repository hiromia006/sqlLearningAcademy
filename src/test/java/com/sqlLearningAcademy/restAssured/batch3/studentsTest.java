package com.sqlLearningAcademy.restAssured.batch3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thedeanda.lorem.LoremIpsum;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class studentsTest extends BaseTest {

    @Test
    public void createStudentHashMapShouldSucceed() {
        HashMap<String, Object> studentJson = new HashMap<>();
        studentJson.put("batchId", 1);
        studentJson.put("name", LoremIpsum.getInstance().getName());
        studentJson.put("contactNo", LoremIpsum.getInstance().getPhone());

        String json;
        try {
            json = new ObjectMapper().writeValueAsString(studentJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(json);

        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(json)
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .statusCode(201)
                .log().body();
    }

    @Test
    public void deleteStudentShouldSucceed() {
        given()
                .log().uri()
                .when()
                .delete("/students/18")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void updateStudentShouldSucceed() {
        JSONObject studentJson = new JSONObject();
        studentJson.put("name", LoremIpsum.getInstance().getName());
        studentJson.put("contactNo", LoremIpsum.getInstance().getPhone());
        studentJson.put("batchId", 1);


        given()
                .body(studentJson.toString())
                .log().uri()
                .log().body()
                .when()
                .put("/students/18")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void getStudentShouldSucceed() {
//        int id = given()
//                .when()
//                .get("/students")
//                .then()
//                .statusCode(200)
//                .log().body()
//                .extract().jsonPath().getInt("[2].id");

        ValidatableResponse validatableResponse = given()
                .when()
                .get("/students")
                .then()
                .statusCode(200);
//                .log().body();

        String contactNo = validatableResponse.extract().jsonPath().getString("[3].contactNo");
        String name = validatableResponse.extract().jsonPath().getString("[5].name");
        int batchId = validatableResponse.extract().jsonPath().getInt("[5].batchId");
        System.out.println(contactNo);
        System.out.println(name);
        System.out.println(batchId);

    }
}
