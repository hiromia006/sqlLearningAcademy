package com.sqlLearningAcademy.testng.batchTwo.classes;

import org.testng.annotations.Test;

public class XmlTest {

    @Test(groups = "smoke")
    public void loginShouldSucceed() {
        System.out.println("Login successfully");
    }

    @Test
    public void loginShouldFail() {
        System.out.println("Login Fail");
    }

    @Test
    public void loginWithoutPasswordShouldFail() {
        System.out.println("Login Fail");
    }
}
