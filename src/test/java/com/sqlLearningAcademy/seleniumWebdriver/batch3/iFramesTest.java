package com.sqlLearningAcademy.seleniumWebdriver.batch3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class iFramesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/frames");

//        System.out.println("iFrame text : "+ driver.findElement(By.id("sampleHeading")).getText().trim());
        driver.switchTo().frame("frame1");
        System.out.println("iFrame text : " + driver.findElement(By.id("sampleHeading")).getText().trim());
        driver.switchTo().defaultContent();

        System.out.println(driver.findElement(By.cssSelector("div#framesWrapper div")).getText());

        driver.quit();
    }
}
