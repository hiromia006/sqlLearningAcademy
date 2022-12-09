package com.sqlLearningAcademy.restAssured.batch3;

import com.sqlLearningAcademy.restAssured.batch3.pojo.Student;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentsPojoTest extends BaseTest {
    @Test
    public void createStudentShouldSucceed() {
        Student student = new Student(1, LoremIpsum.getInstance().getName(), LoremIpsum.getInstance().getPhone());
        given()
                .body(student)
                .log().uri()
                .log().body()
                .when()
                .post("/students")
                .then()
                .statusCode(201)
                .log().body();
    }


    @Test
    public void getStudentShouldSucceed() {
        List<Student> students = given()
                .log().uri()
                .when()
                .get("/students")
                .then()
                .statusCode(200)

                .extract().jsonPath().getList("", Student.class);

        for (Student student : students) {
            System.out.println("Student name: "+student.getName() +" Phone "+student.getContactNo());
            System.out.println("Student name: "+student.getContactNo());
        }
    }
}
