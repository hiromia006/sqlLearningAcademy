package com.sqlLearningAcademy.seleniumWebdriver.batch6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        System.out.printf(driver.getTitle());

        driver.findElement(By.name("username")).sendKeys("skdjhsadh");
        driver.findElement(By.name("password")).sendKeys("skdjhsadh");

        Thread.sleep(3000);
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("in Pa")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("skdjhsadh");
        driver.findElement(By.name("password")).sendKeys("skdjhsadh");

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("564654");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("564654");



        driver.quit();

    }
}
