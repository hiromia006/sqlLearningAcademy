package com.sqlLearningAcademy.seleniumWebdriver.batch3.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FileUploadTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String imagePath = System.getProperty("user.dir") + "/src/test/resources/cricket.jpg";
        System.out.println(imagePath);
        driver.findElement(By.id("file-upload")).sendKeys(imagePath);

        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).submit();
        Thread.sleep(3000);

        driver.quit();

    }
}
