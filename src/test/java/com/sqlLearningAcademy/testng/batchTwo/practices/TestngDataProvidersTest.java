package com.sqlLearningAcademy.testng.batchTwo.practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvidersTest {

    @DataProvider(name = "getSumNumbers2")
    public Object[][] getSumNumbers() {
        return new Object[][]{
                {500, 200},
                {987, 654},
                {654, 4556},
                {321, 123}
        };
    }

    @Test(dataProvider = "getSumNumbers")
    public void sumShouldSucceed(int a, int b) {
        System.out.println("Sum : " + (a + b));
    }

    @Test(dataProvider = "getNumbers", dataProviderClass =TestngParametersTest.class )
    public void subtractShouldSucceed(int a, int b) {
        System.out.println("SubtractS : " + (a - b));
    }
}
