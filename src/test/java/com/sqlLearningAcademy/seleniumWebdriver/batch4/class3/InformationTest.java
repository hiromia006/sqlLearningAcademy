package com.sqlLearningAcademy.seleniumWebdriver.batch4.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InformationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Display : " + driver.findElement(By.id("userName")).isDisplayed());
        System.out.println("isEnabled : " + driver.findElement(By.id("userName")).isEnabled());
        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/checkbox");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.className("rct-icon-uncheck")).isSelected());
        System.out.println(driver.findElement(By.className("rct-icon-uncheck")).getTagName());
        System.out.println(driver.findElement(By.className("rct-icon-uncheck")).getCssValue("font-family"));

        driver.quit();

    }
}
