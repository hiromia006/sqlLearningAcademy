package com.sqlLearningAcademy.java.batch6.additionalClass2;

public class ArithmeticOperatorTwo {
    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int doAddition() {
        return number1 + number2;
    }

    public int doSubtraction() {
        int number3;
        number3 = number1 - number2;
        return number3;
    }

    public double doDivision() {
        return number1 / number2;
    }

    public static void main(String[] args) {
        ArithmeticOperatorTwo operatorTwo = new ArithmeticOperatorTwo();
        operatorTwo.number1 = 90;
        operatorTwo.number2 = 16;
        System.out.println("Addition " + operatorTwo.doAddition());

    }
}
