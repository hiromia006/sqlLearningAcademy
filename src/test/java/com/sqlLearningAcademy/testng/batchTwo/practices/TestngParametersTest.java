package com.sqlLearningAcademy.testng.batchTwo.practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParametersTest {

    @Test
    @Parameters({"a", "b"})
    public void sumTwoNumberShouldSucceed(int a, int b) {
        System.out.println("Sum =: " + (a + b));

    }


    @Test
    @Parameters({"a", "b"})
    public void subtractShouldSucceed(int a, int b) {
        System.out.println("SubTract =: " + (a - b));

    }

    @Test
    @Parameters({"a", "b"})
    public void multiplyTwoNumberShouldSucceed(int a, int b) {
        System.out.println("Multiply =: " + (a * b));

    }

    @DataProvider(name = "getNumbers")
    public Object[][] getNumbers() {
        return new Object[][]{
                {500, 200},
                {987, 654},
                {654, 4556},
                {321, 123}
        };
    }
}
