package com.sqlLearningAcademy.java.batch6.class4;

public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 15;

        if (age >= 21) {
            if (age >= 30) {
                System.out.println("Married");
            }
        } else {
            System.out.println("Unmarried");
        }
    }
}
