package com.sqlLearningAcademy.java.batchThree.controlStatements;

public class IfTest {
    public static void main(String[] args) {
        int mark = 70;

        //Simple if statement
        if (mark == 80) {
            System.out.println("A+");
        }

        //if-else statement
        if (mark == 80) {
            System.out.println("A+");
        } else {
            System.out.println("Fail");
        }

        // if-else-if ladder
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

        //Nested if-statement
        String studentName = "nahida";
        if (studentName.equals("nahida")) {
            if (mark == 80) {
                System.out.println("A+");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
