package com.sqlLearningAcademy.java.batchTwo.practices.supertest;

public class MethodTest {
    void eat() {
        System.out.println("eating...");
    }
}


class MainMethodTest extends MethodTest {

    void eat() {
        System.out.println("eating...MainMethodTest");
    }

    void bark() {
        System.out.println("barking...");
    }

    public void work() {
        super.eat();
        bark();
    }

    public static void main(String[] args) {
        MainMethodTest mainMethodTest = new MainMethodTest();
        mainMethodTest.work();

    }
}