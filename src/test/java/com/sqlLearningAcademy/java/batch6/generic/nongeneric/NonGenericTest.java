package com.sqlLearningAcademy.java.batch6.generic.nongeneric;

public class NonGenericTest {
    public static void main(String[] args) {
        IntegerTest integerTest=new IntegerTest(50);
        System.out.println(integerTest.getAnInt());

        StringTest stringTest=new StringTest("Welcome to SQA Academy");
        System.out.println(stringTest.string);

        DoubleTest doubleTest=new DoubleTest(253.25);
        System.out.println(doubleTest.getaDouble());
    }
}
