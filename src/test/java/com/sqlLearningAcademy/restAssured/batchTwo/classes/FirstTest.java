package com.sqlLearningAcademy.restAssured.batchTwo.classes;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;


public class FirstTest {
    @Test
    public void testWithBdd() {
        given()
                .log().uri()
                .when()
                .get("http://localhost:3000/posts")
                .then()
                .log().body()
                .statusCode(200)
                .body("[0].author", equalTo("typicode"))
                .body("[0].author", containsString("typ"));
    }

    // Without static import and builder pattern
    @Test
    public void testWithoutBdd() {
        // Create a request specification
        RequestSpecification request = RestAssured.given();

        //Adding URI
        request.baseUri("http://localhost:3000/posts");

        // Calling GET method on URI. After hitting we get Response
        Response response = request.get();

        // Let's print response body.
        String resString = response.asString();
        System.out.println("Respnse Details : " + resString);

        ValidatableResponse valRes = response.then();
        // It will check if status code is 200
        valRes.statusCode(200);
        // It will check if status line is as expected
        valRes.body("[0].author", equalTo("typicode"));
        valRes.body("[0].author", containsString("typi"));
    }
}
