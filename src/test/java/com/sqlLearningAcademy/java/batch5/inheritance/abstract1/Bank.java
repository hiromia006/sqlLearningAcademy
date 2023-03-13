package com.sqlLearningAcademy.java.batch5.inheritance.abstract1;

public abstract class Bank {
    abstract double getInterestRate();

    public void printCircular() {
        System.out.println("Please follow Bank rules");
    }
}
