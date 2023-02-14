package com.sqlLearningAcademy.appium.batch4;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseEmulatorAppiumBatch4Test {
    public static AndroidDriver driver;

    @BeforeClass
    public void initialization() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "192.168.56.101:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.thecompletecalculator.cocal");
        capabilities.setCapability("appActivity", ".activities.MainActivity ");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
