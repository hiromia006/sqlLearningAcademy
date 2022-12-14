package com.sqlLearningAcademy.java.batch4.controllerTest;

public class JumpStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {// 0, 1, 2, 3, 4, 5, 6, ...9, 10
            if (i == 5) break;
            System.out.println("Welcome to SQA Learning Academy " + i);
        }

        System.out.println("Jump Statements ==================");
        for (int i = 0; i < 10; i++) {// 0, 1, 2, 3, 4, 5, 6, ...9, 10
            if (i == 5) continue;
            System.out.println("Welcome to SQA Learning Academy " + i);
        }
        // = assign operator
        // == equal operator
    }
}
