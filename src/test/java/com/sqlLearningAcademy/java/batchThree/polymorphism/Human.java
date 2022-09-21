package com.sqlLearningAcademy.java.batchThree.polymorphism;

public class Human extends Animal {
    @Override
    public void printEat() {
        System.out.println("Human eats rice");
    }
}
