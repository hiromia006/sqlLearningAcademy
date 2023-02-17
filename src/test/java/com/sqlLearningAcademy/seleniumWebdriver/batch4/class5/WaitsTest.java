package com.sqlLearningAcademy.seleniumWebdriver.batch4.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement element = driver.findElement(By.className("text"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        wait.until(ExpectedConditions.invisibilityOfAllElements(element));

        driver.findElement(By.id("userName")).sendKeys("asjdkasjkjdh");

        driver.quit();
    }
}
