package com.sqlLearningAcademy.java.batchTwo.practices.supertest;

public class VariableTest {
    String color = "White";
}


class MainTest extends VariableTest {
    String color = "Black";

    public void printColor() {
        System.out.println("Child color : " + color);
        System.out.println("Parent color : " + super.color);
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.printColor();
    }
}
