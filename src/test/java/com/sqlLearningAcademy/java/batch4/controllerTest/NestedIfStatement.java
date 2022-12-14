package com.sqlLearningAcademy.java.batch4.controllerTest;

public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 20;

        if (age > 21) {  // true
            if (age < 30) { //false
                System.out.println("No child");
            } else {
                System.out.println("Have you child?");
            }
        } else {
            System.out.println("you are unmarried");
        }
    }
}
