package com.sqlLearningAcademy.java.batchThree.oops;

public class BracBank extends BangladeshBank {
    public static double getInterestRate() {
        return 5.5;
    }

    @Override
    double getDollarRate() {
        return 112.50;
    }
}
