package com.sqlLearningAcademy.java.batchThree.controlStatements;

public class LoopTest {
    public static void main(String[] args) {
        //increment
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome SQA Learning Academy " + i);
        }

        //decrement
        for (int i = 10; i > 0; i--) {
            System.out.println("Welcome SQA Learning Academy " + i);
        }

        //Java for-each loop: for(data_type var : array_name/collection_name)
        String[] students = {"Ahsan", "Nahida", "khadija", "oba"};
        for (String name : students) {
            System.out.println("SQA Learning Academy Student Name : " + name);
        }

        int[] marks = {70, 50, 60, 75};
        for (int mark : marks) {

            if (mark >= 80 && mark <= 100) {
                System.out.println("A+");
            } else if (mark >= 70 && mark < 80) {
                System.out.println("A");
            } else if (mark >= 60 && mark < 70) {
                System.out.println("A-");
            } else if (mark >= 50 && mark < 60) {
                System.out.println("B");
            } else {
                System.out.println("D");
            }
        }

    }
}
