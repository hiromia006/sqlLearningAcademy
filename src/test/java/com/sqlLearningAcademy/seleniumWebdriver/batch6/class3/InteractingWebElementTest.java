package com.sqlLearningAcademy.seleniumWebdriver.batch6.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InteractingWebElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement webElement=driver.findElement(By.id("user-name"));
        webElement.sendKeys("ddddd");
        Thread.sleep(2500);
        webElement.clear();

        webElement.sendKeys("standard_user");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("ddddd");
        Thread.sleep(2500);
        password.clear();

        password.sendKeys("secret_sauce");

        driver.findElement(By.className("submit-button")).click();





        driver.quit();
    }
}
