package com.sqlLearningAcademy.appium.batch3;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ThirdBatchBaseTest {
    protected AndroidDriver driver;

    @BeforeClass
    public void appiumSetup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("uid", "K3V7N19118006602");
            capabilities.setCapability("platformVersion", "9");
            capabilities.setCapability("appPackage", "com.android.calculator2");
            capabilities.setCapability("appActivity", "Calculator");
            capabilities.setCapability("platformName", "Android");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
