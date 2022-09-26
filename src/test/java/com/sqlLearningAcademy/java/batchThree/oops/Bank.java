package com.sqlLearningAcademy.java.batchThree.oops;

public interface Bank {
    float rateOfInterest();

    default void printDollarRate() {
        System.out.println("Today Dollar rate is 90.25");
    }
}
