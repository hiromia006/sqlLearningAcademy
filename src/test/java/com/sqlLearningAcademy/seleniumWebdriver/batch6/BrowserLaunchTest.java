package com.sqlLearningAcademy.seleniumWebdriver.batch6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserLaunchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.printf(driver.getTitle());

        driver.findElement(By.className("input_error")).sendKeys("546564");

//        driver.findElement(By.id("email")).sendKeys("23123123");
//        driver.findElement(By.id("pass")).sendKeys("sdhsjdsahd");

        Thread.sleep(3000);

        driver.quit();


    }
}
