package com.sqlLearningAcademy.seleniumWebdriver.batch3.class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.findElement(By.tagName(""));

        driver.quit();
    }
}
