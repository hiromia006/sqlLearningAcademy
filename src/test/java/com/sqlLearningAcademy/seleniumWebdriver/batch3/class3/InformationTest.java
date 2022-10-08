package com.sqlLearningAcademy.seleniumWebdriver.batch3.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InformationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement webElement = driver.findElement(By.className("title"));
        System.out.println("isDisplayed : " + webElement.isDisplayed());
        System.out.println("getTagName : " + webElement.getTagName());
        System.out.println("getRect : " + webElement.getRect().getX() + " " + webElement.getRect().getY());
        System.out.println("Get CSS Value : " + webElement.getCssValue("font-size"));
        System.out.println("Get CSS Value : " + webElement.getCssValue("color"));
        System.out.println("Text Content : " + webElement.getText());
        System.out.println("Attributes : " + driver.findElement(By.id("customerForm")).getAttribute("action"));
        Thread.sleep(3000);

        driver.quit();

    }
}
