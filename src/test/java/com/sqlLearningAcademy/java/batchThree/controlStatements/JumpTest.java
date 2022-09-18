package com.sqlLearningAcademy.java.batchThree.controlStatements;

public class JumpTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) break;
            System.out.println("SQA Learning Academy 1 " + i);
            i++;
        }

        //decrement
        for (int j = 10; j > 0; j--) {
            if (j==7) continue;
            System.out.println("SQA Learning Academy 2 " + j);
        }
    }
}
