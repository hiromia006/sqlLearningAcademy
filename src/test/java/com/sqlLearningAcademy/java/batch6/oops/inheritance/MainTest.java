package com.sqlLearningAcademy.java.batch6.oops.inheritance;

public class MainTest {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.name = "Audi";
        audi.color = "Pink";
        audi.model="A3";
        audi.price=123456789;

        audi.printPrice();
        audi.stop();
        audi.start();
        audi.run();
    }
}
