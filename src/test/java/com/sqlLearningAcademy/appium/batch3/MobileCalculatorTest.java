package com.sqlLearningAcademy.appium.batch3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileCalculatorTest extends ThirdBatchBaseTest {
    @Test(description = "8 plus 9")
    public void addShouldSucceed() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("digit_8")).isDisplayed();
        driver.findElement(By.id("digit_8")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("op_add")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("digit_9")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("eq")).click();
        Thread.sleep(3000);

        String result = driver.findElement(By.id("formula")).getText();
        System.out.println("result =: " + result);
        Assert.assertEquals("17", result);

    }

    @Test(description = "100 minus 66")
    public void minusShouldSucceed() throws InterruptedException {
        WebElement webElement = driver.findElement(By.id("digit_1"));
        webElement.isDisplayed();
        webElement.click();
        Thread.sleep(3000);

        WebElement zeroEl = driver.findElement(By.id("digit_0"));
        zeroEl.click();
        zeroEl.click();
        Thread.sleep(3000);

        driver.findElement(By.id("op_sub")).click();

        WebElement sixEl = driver.findElement(By.id("digit_6"));
        sixEl.click();
        sixEl.click();
        Thread.sleep(3000);

        driver.findElement(By.id("eq")).click();
        Thread.sleep(3000);

        String result = driver.findElement(By.id("formula")).getText();
        System.out.println("result =: " + result);
        Assert.assertEquals("34", result);
    }


    @Test(description = "100 multiplication 66")
    public void MultiplicationShouldSucceed() throws InterruptedException {
        WebElement webElement = driver.findElement(By.id("digit_1"));
        webElement.isDisplayed();
        webElement.click();
        Thread.sleep(3000);

        WebElement zeroEl = driver.findElement(By.id("digit_0"));
        zeroEl.click();
        zeroEl.click();
        Thread.sleep(3000);

        driver.findElement(By.id("op_mul")).click();

        WebElement sixEl = driver.findElement(By.id("digit_6"));
        sixEl.click();
        sixEl.click();
        Thread.sleep(3000);

        driver.findElement(By.id("eq")).click();
        Thread.sleep(3000);

        String result = driver.findElement(By.id("formula")).getText();
        System.out.println("result =: " + result);
        Assert.assertEquals("6600", result.replaceAll(",", ""));
    }


    @Test(description = "100/10")
    public void divideShouldSucceed() throws InterruptedException {
        WebElement oneEl = driver.findElement(By.id("digit_1"));
        oneEl.isDisplayed();
        oneEl.click();
        Thread.sleep(3000);

        WebElement zeroEl = driver.findElement(By.id("digit_0"));
        zeroEl.click();
        zeroEl.click();
        Thread.sleep(3000);

        driver.findElement(By.id("op_div")).click();

        oneEl.click();
        zeroEl.click();

        driver.findElement(By.id("eq")).click();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("formula")).getText();
        System.out.println("result =: " + result);
        Assert.assertEquals("10", result);
    }
}
