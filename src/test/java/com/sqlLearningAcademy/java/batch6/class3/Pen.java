package com.sqlLearningAcademy.java.batch6.class3;

public class Pen {
    String color;
    String name;
    int length;

    public Pen() {
        System.out.println("Default constructor");
    }

    public Pen(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("Parameter constructor");
    }

    public void write() {
        System.out.println(name + " valo likhe");
    }

    public static void main(String[] args) {
        Pen pen = new Pen(); //new className()
//        pen.name = "Echono Dx";
        pen.write();

//        Pen pen1 = new Pen("Echono", "Black");
//        pen1.write();
    }
}
