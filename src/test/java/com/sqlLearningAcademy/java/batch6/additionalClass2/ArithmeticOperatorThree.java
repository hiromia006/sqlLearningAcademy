package com.sqlLearningAcademy.java.batch6.additionalClass2;

public class ArithmeticOperatorThree {

    public void doAddition(int number1, int number2) {
        int number;
        number = number1 + number2;
        System.out.println(number);
    }

    public int doMinus(int number1, int number2) {
        int number;
        number = number1 - number2;
        return number;
    }

    public static void main(String[] args) {
        ArithmeticOperatorThree three=new ArithmeticOperatorThree();
        three.doAddition(40,25);
        System.out.println(three.doMinus(10, 80));
    }
}
