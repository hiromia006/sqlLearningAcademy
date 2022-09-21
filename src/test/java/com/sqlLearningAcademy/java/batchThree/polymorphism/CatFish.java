package com.sqlLearningAcademy.java.batchThree.polymorphism;

public class CatFish extends Fish {
    @Override
    public void printEat() {
        System.out.println("CatFish eats fish");
    }
}
