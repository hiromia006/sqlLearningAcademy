package com.sqlLearningAcademy.java.batch6.class2;

public class LogicalOperator {
    public static void main(String[] args) {
      int  subject1mark = 80, subject2Mark = 10;

        System.out.println( (subject2Mark < subject1mark) || (subject2Mark > subject1mark) );
        System.out.println( (subject2Mark < subject1mark) && (subject2Mark > subject1mark) );
        System.out.println( (subject2Mark < subject1mark) && (subject2Mark != subject1mark) );
    }
}
