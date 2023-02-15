package com.sqlLearningAcademy.seleniumWebdriver.batch4.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WindowsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();


        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String originalWindow = driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demoqa.com/sample");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.close();

//        driver.switchTo().window(originalWindow);

        Thread.sleep(3000);
        driver.quit();
    }
}
