package com.sqlLearningAcademy.java.batch5.inheritance;

public class Child extends Woman {
    public void play() {
        System.out.println("Play");
    }

    public void eat() {
        System.out.println("Child eat soft food");
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.hairLength);
        System.out.println(child.name);
        child.gossip();
        child.eat();
        child.sleep();
        child.play();
    }
}
