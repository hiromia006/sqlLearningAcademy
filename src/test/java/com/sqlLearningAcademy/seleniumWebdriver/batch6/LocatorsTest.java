package com.sqlLearningAcademy.seleniumWebdriver.batch6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        System.out.printf(driver.getTitle());

        driver.quit();


    }
}
