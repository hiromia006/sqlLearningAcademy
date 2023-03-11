package com.sqlLearningAcademy.java.batch5.inheritance;

public class Woman extends Animal {
    public int hairLength = 10;

    public void gossip() {
        System.out.println("Gossip ......");
    }

    @Override
    public void eat() {
        int dailyMeal = 3;
        System.out.println("Woman eats " + dailyMeal + " times rice");
    }
}
