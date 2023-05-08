package com.sqlLearningAcademy.appium.batch5.pom;

import com.emi.calculator.pom.util.General;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class BaseAppiumBatch5Test {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", "192.168.56.101:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "10");
        capabilities.setCapability("appium:appPackage", "com.continuum.emi.calculator");
        capabilities.setCapability("appium:appActivity", "com.finance.emicalci.activity.Splash_screnn");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(General.WAIT_TIME));

        //Start recording screen
        driver.startRecordingScreen();

    }

    @AfterClass
    public void tearDown() {
        stopRecording();
        driver.quit();
    }


    private void stopRecording() {
        String projectHomeDirectory = System.getProperty("user.dir");
        String base64String = driver.stopRecordingScreen();
        byte[] data = Base64.decodeBase64(base64String);
        String destinationPath = projectHomeDirectory + "/build/videos";
        File theDir = new File(destinationPath);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        String filePath = destinationPath + "/" + driver.getDeviceTime().replace(":", "_").replace("+", " ") + ".mp4";
        System.out.println("filePath : " + filePath);
        Path path = Paths.get(filePath);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
