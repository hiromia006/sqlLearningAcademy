package com.sqlLearningAcademy.java.batch6.class5.abstraction;

public abstract class BangladeshBank {
    abstract public double getInterestRate();

    public void submitIncomeTax() {
        System.out.println("Please submit Income Tax at End of year");
    }
}
