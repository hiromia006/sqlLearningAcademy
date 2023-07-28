package com.sqlLearningAcademy.seleniumWebdriver.batch6.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InformationWebTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.isDisplayed();
        webElement.sendKeys("locked_out_user");
        System.out.println("getText =: "+driver.findElement(By.className("login_logo")).getText());
        System.out.println("TagName =: "+webElement.getTagName());
        System.out.println("CSS Font =: "+webElement.getCssValue("font-family"));
        System.out.println("(x,y) =: "+webElement.getRect().getX() +", "+webElement.getRect().getY());


        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");


        driver.quit();

    }
}
