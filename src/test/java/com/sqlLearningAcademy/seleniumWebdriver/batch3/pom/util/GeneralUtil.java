package com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.util;

public class GeneralUtil {
    public final static int PAGE_LOAD_TIME = 30;

    public static void domStable() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
