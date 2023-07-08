package com.sqlLearningAcademy.java.batch6.additionalClass;

public class Car {
    public String colour;
    public int whileHeight;
    public String name;
    public int speed;


    public void printSpeed() {
        System.out.println(name + " speed is  " + speed);
    }

    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.name = "Mercedes";
        mercedes.speed = 70;
        mercedes.printSpeed();


        Car bmw = new Car();
        bmw.name = "MBW";
        bmw.speed = 80;
        bmw.printSpeed();


        Car audi = new Car();
        audi.name = "Audio";
        audi.speed = 100;
        audi.printSpeed();

    }


}
