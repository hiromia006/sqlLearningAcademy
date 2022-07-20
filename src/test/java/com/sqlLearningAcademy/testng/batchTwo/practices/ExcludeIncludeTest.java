package com.sqlLearningAcademy.testng.batchTwo.practices;

import org.testng.annotations.Test;

public class ExcludeIncludeTest {

    @Test
    public void loginShouldSucceed() {
        System.out.println("Successfully Login into Application");
    }

    @Test
    public void loginShouldFail() {
        System.out.println("User unable to login Application");
    }
}
