package com.sqlLearningAcademy.testng.batchTwo.classes;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParametersTest {

    @Test
    @Parameters({"a", "b"})
    public void sumShouldSucceed(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Sum = :" + c);
        Assert.assertEquals(c, 15);
    }

    @Test
    @Parameters({"a", "b"})
    public void subtractShouldSucceed(int a, int b) {
        System.out.println("sub =: " + (a - b));

    }

    @Test
    @Parameters({"a", "b"})
    public void multiplyShouldSucceed(int a, int b) {
        System.out.println(" multipe = " + (a * b));

    }
}
