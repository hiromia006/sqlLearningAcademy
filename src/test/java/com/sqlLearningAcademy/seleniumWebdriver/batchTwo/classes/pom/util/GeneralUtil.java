package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.util;

public class GeneralUtil {
    static public int PAGE_LOAD_TIME = 60;
    public static int IMPLICIT_WAIT = 30;

    public static void waitForDomStable() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
