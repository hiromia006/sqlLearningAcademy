package com.sqlLearningAcademy.seleniumWebdriver.batch3.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserNavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(3000);
        driver.navigate().to("https://parabank.parasoft.com/parabank/lookup.htm");

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.quit();

    }
}
