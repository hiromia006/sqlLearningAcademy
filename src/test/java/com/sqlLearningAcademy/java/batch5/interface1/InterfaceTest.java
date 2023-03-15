package com.sqlLearningAcademy.java.batch5.interface1;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Drawable.message);
        System.out.println(Drawable.drawCube(12));

        Circle circle = new Circle();
        circle.draw();
        circle.drawSomeThings();

        Drawable drawable = new Circle();


    }
}
