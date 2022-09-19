package com.sqlLearningAcademy.java.batchTwo.practices.supertest;

public class ConstructorTest {
    ConstructorTest() {
        System.out.println("animal is created");
    }
}


class MainConstructorTest extends ConstructorTest{
    public MainConstructorTest() {
        super();
        System.out.println("dog is created");
    }

    public static void main(String[] args) {
        MainMethodTest mainMethodTest = new MainMethodTest();

    }
}
