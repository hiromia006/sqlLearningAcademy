package com.sqlLearningAcademy.java.batch5.abstract1;


//  Alt + Enter
public class BracBank extends Bank {

    @Override
    double getInterestRate() {
        return 8.5;
    }


    public double getLoanAmount(int amount) {
        return (((getInterestRate() / 100) / 365) * amount * 120) + amount;
    }
}
