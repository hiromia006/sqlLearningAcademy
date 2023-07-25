package com.sqlLearningAcademy.seleniumWebdriver.batch6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdAndClassLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.printf(driver.getTitle());

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
