package com.sqlLearningAcademy.java.batch4.controllerTest;

public class ForLoop {
    public static void main(String[] args) {
        //     Java for loop: for(initialization, condition, increment/decrement)
        for (int i = 0; i < 10; i++) {// 0, 1, 2, 3, 4, 5, 6, ...9, 10
            System.out.println("Welcome to SQA Learning Academy " + i);
        }
        System.out.println("====================================================");
        for (int i = 10; i > 0; i--) {// 10, 9, 8, 7, ...1, 0
            System.out.println("Welcome to SQA Learning Academy " + i);
        }
    }
}
