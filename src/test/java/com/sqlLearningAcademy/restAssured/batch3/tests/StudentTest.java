package com.sqlLearningAcademy.restAssured.batch3.tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sqlLearningAcademy.restAssured.batch3.tests.pojo.Student;
import com.thedeanda.lorem.LoremIpsum;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class StudentTest extends BaseTest {

    @Test
    public void getStudentShouldSucceed() {
        given()
                .log().uri()
                .when()
                .get("/students")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void createStudentShouldSucceed() {
        String json = "{\"batchId\":1,\"name\":\"Ali Ahsan2\",\"contactNo\":\"0164646462\"}";
        given()
                .contentType(ContentType.JSON)
                .body(json)
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .log().body();

        given()
                .log().uri()
                .when()
                .get("/students")
                .then()
                .statusCode(200)
                .log().body();

    }

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
    public void createStudentJsonShouldSucceed() {
        JSONObject studentJson = new JSONObject();
        studentJson.put("batchId", 1);
        studentJson.put("name", LoremIpsum.getInstance().getName());
        studentJson.put("contactNo", LoremIpsum.getInstance().getPhone());

        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(studentJson.toString())
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .statusCode(201)
                .log().body();
    }

    @Test
    public void createStudentJsonAssertionShouldSucceed() {
        String name = LoremIpsum.getInstance().getName();
        String contactNo = LoremIpsum.getInstance().getPhone();

        JSONObject studentJson = new JSONObject();
        studentJson.put("batchId", 1);
        studentJson.put("name", name);
        studentJson.put("contactNo", contactNo);

        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(studentJson.toString())
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .log().body()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("contactNo", equalTo(contactNo))
                .body("batchId", equalTo(1));
    }

    @Test
    public void createStudentIndepenedShouldSucceed() {
        int batchId = given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("/batch")
                .then()
                .statusCode(200)
                .log().body()
                .extract().jsonPath().getInt("[0].id");


        String name = LoremIpsum.getInstance().getName();
        String contactNo = LoremIpsum.getInstance().getPhone();

        JSONObject studentJson = new JSONObject();
        studentJson.put("batchId", batchId);
        studentJson.put("name", name);
        studentJson.put("contactNo", contactNo);

        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(studentJson.toString())
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .log().body()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("contactNo", equalTo(contactNo))
                .body("batchId", equalTo(batchId));
    }

    @Test
    public void updateStudentShouldSucceed() {
        int batchId = given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("/batch")
                .then()
                .statusCode(200)
                .log().body()
                .extract().jsonPath().getInt("[0].id");

        String name = LoremIpsum.getInstance().getName();
        String contactNo = LoremIpsum.getInstance().getPhone();
        JSONObject studentJson = new JSONObject();
        studentJson.put("batchId", batchId);
        studentJson.put("name", name);
        studentJson.put("contactNo", contactNo);

        int studentId = given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(studentJson.toString())
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .log().body()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("contactNo", equalTo(contactNo))
                .body("batchId", equalTo(batchId))
                .extract().jsonPath().getInt("id");

        String updateName = LoremIpsum.getInstance().getName();
        String updateContactNo = LoremIpsum.getInstance().getPhone();
        JSONObject updateStudent = new JSONObject();
        studentJson.put("batchId", batchId);
        studentJson.put("name", updateContactNo);
        studentJson.put("contactNo", updateName);

        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(updateStudent.toString())
                .log().uri()
                .log().body()
                .when()
                .put("/students/" + studentId)
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void deleteStudentShouldSucceed() {
        int batchId = given()
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get("/batch")
                .then()
                .statusCode(200)
                .log().body()
                .extract().jsonPath().getInt("[0].id");

        String name = LoremIpsum.getInstance().getName();
        String contactNo = LoremIpsum.getInstance().getPhone();
        JSONObject studentJson = new JSONObject();
        studentJson.put("batchId", batchId);
        studentJson.put("name", name);
        studentJson.put("contactNo", contactNo);

        int studentId = given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(studentJson.toString())
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .log().body()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("contactNo", equalTo(contactNo))
                .body("batchId", equalTo(batchId))
                .extract().jsonPath().getInt("id");


        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .log().uri()
                .log().body()
                .when()
                .delete("/students/" + studentId)
                .then()
                .log().body();
    }

    @Test
    public void createStudentPojoShouldSucceed() {
        given()
                .contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(new Student(LoremIpsum.getInstance().getName(),1, LoremIpsum.getInstance().getPhone() ))
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .statusCode(201)
                .log().body();
    }
}
