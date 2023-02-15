package com.sqlLearningAcademy.appium.batch4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CalculatorBatchAppium4Test extends BaseBatchAppium4Test {
    @Test
    public void addShouldSucceed() throws InterruptedException {
        WebElement webElement7 = driver.findElement(By.id("calc_keypad_btn_07"));
        webElement7.isDisplayed();
        webElement7.click();
        Thread.sleep(3000);

        WebElement add = driver.findElement(By.id("calc_keypad_btn_add"));
        add.isDisplayed();
        add.click();
        Thread.sleep(3000);

        WebElement webElement8 = driver.findElement(By.id("calc_keypad_btn_08"));
        webElement8.isDisplayed();
        webElement8.click();
        Thread.sleep(3000);

        WebElement equalEl = driver.findElement(By.id("calc_keypad_btn_equal"));
        equalEl.isDisplayed();
        equalEl.click();
        Thread.sleep(3000);

    }
}
