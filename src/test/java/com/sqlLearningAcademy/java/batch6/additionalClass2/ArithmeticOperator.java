package com.sqlLearningAcademy.java.batch6.additionalClass2;

public class ArithmeticOperator {
    private int number1, number2;

    public ArithmeticOperator() {

    }

    public ArithmeticOperator(int number1) {
        this.number1 = number1;
    }

    public ArithmeticOperator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public void printAddition() {
        System.out.println("Addition " + (number1 + number2));
    }

    public void printSubTract() {
        System.out.println("SubTract " + (number1 - number2));
    }

    public void printMultiplyBy10() {
        System.out.println("Multiple " + (number1 * 10));
    }

    public void printDividedBy2() {
        System.out.println("Divided " + (number1 / 2));
    }

    public static void main(String[] args) {
        ArithmeticOperator operator = new ArithmeticOperator();
        operator.number1 = 100;
        operator.number2 = 10;

        operator.printAddition();
        operator.printSubTract();
        operator.printMultiplyBy10();
        operator.printDividedBy2();

    }

}
