package com.sqlLearningAcademy.seleniumWebdriver.batch4.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();


        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //JavaScript alerts
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


        //confirm alert
        driver.findElement(By.id("confirmButton")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

        //prompt alert
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Welcome");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


        Thread.sleep(3000);
        driver.navigate().refresh();

        //JavaScript alerts
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        //confirm alert
        driver.findElement(By.id("confirmButton")).click();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.dismiss();

        //prompt alert
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        alert.sendKeys("Welcome");
        Thread.sleep(3000);
        alert.accept();

        driver.quit();
    }
}
