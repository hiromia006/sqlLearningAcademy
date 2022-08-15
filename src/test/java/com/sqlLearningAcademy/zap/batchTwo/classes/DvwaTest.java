package com.sqlLearningAcademy.zap.batchTwo.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DvwaTest extends BaseTest {

    @Test
    public void bruteForceAttackShouldSucceed() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href*='brute']")).click();
        WebElement usernameEl = driver.findElement(By.cssSelector("input[type='text']"));
        usernameEl.isDisplayed();
        usernameEl.sendKeys("admin");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }

    @Test
    public void testCsrfTokenShouldSucceed() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href*='csrf/']")).click();

        driver.findElement(By.cssSelector("input[name='password_current']")).sendKeys("password");
        driver.findElement(By.cssSelector("input[name='password_new']")).sendKeys("password");
        driver.findElement(By.cssSelector("input[name='password_conf']")).sendKeys("password");

    }
}
