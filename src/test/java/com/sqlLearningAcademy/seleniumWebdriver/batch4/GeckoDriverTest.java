package com.sqlLearningAcademy.seleniumWebdriver.batch4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverTest {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", "/home/jannat/githubProjects/batch4/seleniumBatch4/driver/geckodriver");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.quit();
    }
}
