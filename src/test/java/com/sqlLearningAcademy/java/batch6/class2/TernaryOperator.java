package com.sqlLearningAcademy.java.batch6.class2;

public class TernaryOperator {
    private int age=50;
    public static void main(String[] args) { //.25

        int subject1mark = 80, subject2Mark = 13;
        int subject3;
        String name;

        subject3 = subject1mark < subject2Mark ? subject1mark : subject2Mark;
        System.out.println(subject3);//13

        subject3 = subject1mark > subject2Mark ? subject1mark : subject2Mark;
        System.out.println(subject3);//80

        //subject1mark = 80, subject2Mark = 13;
        name = subject1mark > subject2Mark ? "Tasu" : "Tahia";
        System.out.println(name);//Tasu

    }
}
