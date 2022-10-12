package com.sqlLearningAcademy.seleniumWebdriver.batch3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Alert
        driver.findElement(By.id("alertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        // Confirmation
        WebElement webElement = driver.findElement(By.id("confirmButton"));
        webElement.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        webElement.click();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);

        // Confirmation
        WebElement prompt = driver.findElement(By.id("promtButton"));
        prompt.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.dismiss();
        Thread.sleep(3000);

        prompt.click();
        Thread.sleep(2000);
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Knowledge Explorer");
        promptAlert.accept();
        Thread.sleep(3000);

        driver.quit();
    }
}
