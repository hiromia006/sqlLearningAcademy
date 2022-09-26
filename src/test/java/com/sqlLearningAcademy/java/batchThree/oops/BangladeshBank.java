package com.sqlLearningAcademy.java.batchThree.oops;

public abstract class BangladeshBank {
    public static long reserveMoney = 987654321124567l;

    abstract double getDollarRate();

    public void printTwoTakaNote() {
        System.out.println("print Two Taka Note");
    }
}
