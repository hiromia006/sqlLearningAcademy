package com.sqlLearningAcademy.java.batch5.inheritance.abstract1;

public class AbstractionTest {
    public static void main(String[] args) {
        BracBank bank = new BracBank();
        System.out.println(bank.getInterestRate());
        bank.printCircular();
        System.out.println(bank.getLoanAmount(20000));

        Bank bracBank = new BracBank();
        bracBank.printCircular();
        System.out.println(bracBank.getInterestRate());

    }
}
