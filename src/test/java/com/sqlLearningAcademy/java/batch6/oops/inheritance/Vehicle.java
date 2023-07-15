package com.sqlLearningAcademy.java.batch6.oops.inheritance;

public class Vehicle {
    public String name;
    public String color;
    public String model;
    public double price;


    public Vehicle(){

    }

    public void run() {
        System.out.println(name + " runs");
    }

    public void start() {
        System.out.println(name + " starts");
    }

}
