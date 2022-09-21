package com.sqlLearningAcademy.java.batchThree.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.printEat();

        CatFish catFish = new CatFish();
        catFish.printEat();

        Fish fish1 = new CatFish();
        fish1.printEat();

    }
}
