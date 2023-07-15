package com.sqlLearningAcademy.java.batch6.additionalClass2;

public class Tester {
    public static void main(String[] args) {
        ArithmeticOperator operator = new ArithmeticOperator(60);
        operator.printMultiplyBy10();
        operator.printDividedBy2();

        ArithmeticOperator operator1 = new ArithmeticOperator(90, 30);
        operator1.printAddition();
        operator1.printSubTract();
        operator1.printMultiplyBy10();
        operator1.printDividedBy2();

        ArithmeticOperatorTwo operatorTwo=new ArithmeticOperatorTwo();
        operatorTwo.setNumber1(50);
        operatorTwo.setNumber2(20);
        System.out.println(operatorTwo.doSubtraction());
    }
}
