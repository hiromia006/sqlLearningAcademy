package com.sqlLearningAcademy.java.batch4.controllerTest;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int mark = 500;

        if (mark >= 0 && mark <= 33) { // true && false = false
            System.out.println("Grade F");
        } else if (mark > 33 && mark <= 50) {  // true && false= false
            System.out.println("Grade C");
        } else if (mark > 50 && mark <= 60) {  // true && true =true
            System.out.println("Grade B");
        } else if (mark > 60 && mark <= 70) {
            System.out.println("Grade A-");
        } else if (mark > 70 && mark <= 80) {
            System.out.println("Grade A");
        } else if (mark > 80 && mark <= 100) {
            System.out.println("Grade A+");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
