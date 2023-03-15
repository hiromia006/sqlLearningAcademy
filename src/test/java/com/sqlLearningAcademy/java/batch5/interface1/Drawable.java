package com.sqlLearningAcademy.java.batch5.interface1;

public interface Drawable {
    String message = "Drawable picture";

    void draw();

    default void drawSomeThings() {
        drawPicture();
        System.out.println("Please draw somethings");
    }

    static int drawCube(int length) {
        return length * length * length;
    }

    private void drawPicture() {
        System.out.println("Private Method");
    }
}
