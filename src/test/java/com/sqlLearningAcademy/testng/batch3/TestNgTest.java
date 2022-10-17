package com.sqlLearningAcademy.testng.batch3;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgTest {
    @BeforeClass
    public void beforeClassTest() {
        System.out.println("Before Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(groups = "smoke")
    public void addTwoNumber1() {
        int sum;
        sum = 10 + 15;
        System.out.println("Test 1");
        Assert.assertEquals(sum, 25);
    }

    @Test
    public void addTwoNumber2() {
        int sum;
        sum = 11 + 15;
        System.out.println("Test 2");
        Assert.assertEquals(sum, 26);
    }

    @Test
    public void addTwoNumber3() {
        int sum;
        sum = 11 + 15;
        Assert.assertEquals(sum, 26);
    }

    @Test
    public void addTwoNumber4() {
        int sum;
        sum = 11 + 15;
        Assert.assertEquals(sum, 26);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after Test");
    }

    @AfterClass
    public void afterClassTest() {
        System.out.println("after Class");
    }

}
