package com.sqlLearningAcademy.java.batch6.oops.abstraction;

// press Alt + Enter
public class BracBank extends BangladeshBank {

    @Override
    public double getInterestRate() {
        return 10.50;
    }

    public void giveCreditCard(){
        System.out.println("Brac Bank provide Credit card with 2 years charge free");
    }
}
