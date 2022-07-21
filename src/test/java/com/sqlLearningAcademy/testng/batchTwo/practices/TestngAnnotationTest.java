package com.sqlLearningAcademy.testng.batchTwo.practices;

import org.testng.annotations.*;

public class TestngAnnotationTest {



    @Test
    public void addUserShouldSucceed() {
        System.out.println("   Add user Test");
    }

    @Test
    public void updateUserShouldSucceed() {
        System.out.println("   Update user Test");
    }

    @Test
    public void deleteUserShouldSucceed() {
        System.out.println("   Delete user Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }


    @AfterSuite
    public void afterSuites() {
        System.out.println("Before Suites");
    }


    @BeforeSuite
    public void beforeSuites() {
        System.out.println("Before Suites");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
}
