package com.sqlLearningAcademy.java.batch5.generics.nongeneric;

public class NonGenericTest {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest(5100);
        System.out.println(integerTest.getNumber());

        LongTest longTest = new LongTest(98756);
        System.out.println(longTest.getNumber());

        StringTest stringTest = new StringTest("Welcome");
        System.out.println(stringTest.getString());


    }
}
