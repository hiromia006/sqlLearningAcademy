package com.sqlLearningAcademy.seleniumWebdriver.batch3.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebElementTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        WebElement webElement = driver.findElement(By.tagName("a"));
        System.out.println("First Link : "+webElement.getText());

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("Link Number:" + webElements.size());
        for (WebElement webElement1 : webElements) {
            System.out.println(webElement1.getText());
        }

        driver.quit();

    }
}
