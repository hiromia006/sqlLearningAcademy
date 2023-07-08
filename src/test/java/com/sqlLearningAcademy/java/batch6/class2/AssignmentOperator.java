package com.sqlLearningAcademy.java.batch6.class2;

public class AssignmentOperator {
    public static void main(String[] args) {
        int subject1mark = 80, subject2Mark = 13;
        int subject3;      //= += -= *= /= %=

        subject3=subject1mark; //assign operator
        System.out.println(subject3); //80

        subject1mark+=20; // subject1mark=subject1mark+20;
        System.out.println(subject1mark); //100

        subject1mark-=50; //subject1mark=subject1mark-50;
        System.out.println(subject1mark); //50

        subject3*=10;//subject3=subject3*10;
        System.out.println(subject3); //800

        subject1mark/=subject2Mark;
        System.out.println(subject1mark);//3

        subject2Mark%=subject1mark;
        System.out.println(subject2Mark); //1
    }
}
