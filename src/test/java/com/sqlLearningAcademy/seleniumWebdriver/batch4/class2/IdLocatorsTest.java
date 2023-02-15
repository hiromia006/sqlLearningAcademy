package com.sqlLearningAcademy.seleniumWebdriver.batch4.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocatorsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("saima@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("saima122");
        Thread.sleep(2000);

        driver.findElement(By.className("form-control")).sendKeys("afalskf sdnklksan");

        driver.quit();
    }
}
