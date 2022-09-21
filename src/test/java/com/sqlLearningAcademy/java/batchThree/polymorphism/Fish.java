package com.sqlLearningAcademy.java.batchThree.polymorphism;

public class Fish extends Animal {
    @Override
    public void printEat() {
        System.out.println("Fish eats insects");
    }
}
