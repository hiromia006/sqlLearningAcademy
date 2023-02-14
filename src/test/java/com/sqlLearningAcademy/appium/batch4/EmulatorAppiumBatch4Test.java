package com.sqlLearningAcademy.appium.batch4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmulatorAppiumBatch4Test extends BaseEmulatorAppiumBatch4Test {

    @Test
    public void addShouldSucceed() throws InterruptedException {
        WebElement webElement7 = driver.findElement(By.id("panel_btn_7"));
        webElement7.isDisplayed();
        webElement7.click();
        Thread.sleep(3000);

        WebElement plus = driver.findElement(By.id("panel_btn_plus"));
        plus.isDisplayed();
        plus.click();
        Thread.sleep(3000);

        WebElement webElement5 = driver.findElement(By.id("panel_btn_5"));
        webElement5.isDisplayed();
        webElement5.click();

        WebElement equalBtn = driver.findElement(By.id("panel_btn_result"));
        equalBtn.isDisplayed();
        equalBtn.click();

        String result = driver.findElement(By.id("formula")).getText().trim();
        Assert.assertEquals("12", result);

    }

    @Test
    public void subtractShouldSucceed() throws InterruptedException {
        WebElement webElement7 = driver.findElement(By.id("panel_btn_7"));
        webElement7.isDisplayed();
        webElement7.click();
        Thread.sleep(3000);

        WebElement panel_btn_minus = driver.findElement(By.id("panel_btn_minus"));
        panel_btn_minus.isDisplayed();
        panel_btn_minus.click();
        Thread.sleep(3000);

        WebElement webElement5 = driver.findElement(By.id("panel_btn_5"));
        webElement5.isDisplayed();
        webElement5.click();

        WebElement equalBtn = driver.findElement(By.id("panel_btn_result"));
        equalBtn.isDisplayed();
        equalBtn.click();

        String result = driver.findElement(By.id("formula")).getText().trim();
        Assert.assertEquals("2", result);

    }

    @Test
    public void multiplyShouldSucceed() throws InterruptedException {
        WebElement webElement9 = driver.findElement(By.id("panel_btn_9"));
        webElement9.isDisplayed();
        webElement9.click();
        Thread.sleep(3000);

        WebElement panel_btn_mult = driver.findElement(By.id("panel_btn_mult"));
        panel_btn_mult.isDisplayed();
        panel_btn_mult.click();
        Thread.sleep(3000);

        WebElement webElement3 = driver.findElement(By.id("panel_btn_3"));
        webElement3.isDisplayed();
        webElement3.click();
        Thread.sleep(3000);

        WebElement equalBtn = driver.findElement(By.id("panel_btn_result"));
        equalBtn.isDisplayed();
        equalBtn.click();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("formula")).getText().trim();
        Assert.assertEquals("27", result);
    }


    @Test
    public void divideShouldSucceed() throws InterruptedException {
        WebElement webElement9 = driver.findElement(By.id("panel_btn_9"));
        webElement9.isDisplayed();
        webElement9.click();
        Thread.sleep(3000);

        WebElement panel_btn_div = driver.findElement(By.id("panel_btn_div"));
        panel_btn_div.isDisplayed();
        panel_btn_div.click();
        Thread.sleep(3000);

        WebElement webElement3 = driver.findElement(By.id("panel_btn_3"));
        webElement3.isDisplayed();
        webElement3.click();
        Thread.sleep(3000);

        WebElement equalBtn = driver.findElement(By.id("panel_btn_result"));
        equalBtn.isDisplayed();
        equalBtn.click();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("formula")).getText().trim();
        Assert.assertEquals("3", result);
    }

}
