package com.sqlLearningAcademy.java.batch4.operators;

public class OperatorTest {
    public static void main(String[] args) {
        int age = 30, mark = 80;
        int a = 10, b = 20, c = 30, d = 40, e;

        //Ternary Operator
        e = a > b ? a : b;
        System.out.println("Ternary Operator " + e);

        //Assignment Operator
        System.out.println(a);

        a += 4; //a=a+4;
        System.out.println(a);

        b -= 10; //b=b-1o; b=20-10=10
        System.out.println(b);

        c *= 3;
        System.out.println(c);

        d /= 10;
        System.out.println(d);

        d %= 3;
        System.out.println(d);

    }
}
