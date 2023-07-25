package com.sqlLearningAcademy.seleniumWebdriver.batch6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FindAllLinkTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        System.out.printf(driver.getTitle());

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement webElement : webElements) {
            System.out.println(webElement.getAttribute("href"));
        }

        driver.quit();
    }
}
