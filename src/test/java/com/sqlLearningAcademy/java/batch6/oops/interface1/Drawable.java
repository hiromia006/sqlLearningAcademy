package com.sqlLearningAcademy.java.batch6.oops.interface1;

public interface Drawable {
    void draw();

    default void printMessage() {
        System.out.println("Print message");
        drawCircle();
    }

    static int drawSquare(int length) {
        return length * length;
    }

    private void drawCircle() {
        System.out.println(" Circle Area " + (3.1417 * 14 * 14));
    }
}
