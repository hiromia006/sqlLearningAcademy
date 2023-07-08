package com.sqlLearningAcademy.java.batch6.class4;

public class JumpStatements {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i == 5) continue;
            System.out.println("count " + i);
        }

        System.out.println("=========================");
        for (int j = 10; j >= 1; --j) {
            if (j == 5) break;
            System.out.println("count " + j);
        }
    }
}
