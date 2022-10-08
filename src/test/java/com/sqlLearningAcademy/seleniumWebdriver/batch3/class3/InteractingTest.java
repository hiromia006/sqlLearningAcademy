package com.sqlLearningAcademy.seleniumWebdriver.batch3.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InteractingTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement webElement = driver.findElement(By.name("firstName"));
        webElement.click();
        Thread.sleep(2000);

        webElement.sendKeys("Before SQA Learning");
        Thread.sleep(2000);

        webElement.clear();
        Thread.sleep(2000);

        webElement.sendKeys("After SQA Learning");
        Thread.sleep(2000);

        driver.findElement(By.name("submit")).submit();
        Thread.sleep(5000);

        driver.quit();


    }
}
