package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseSeleniumBatch4Test {
    @FindBy(id = "customer.firstName")
    WebElement firstNameEl;

    @FindBy(id = "customer.lastName")
    WebElement lastNameEl;

    @FindBy(id = "customer.address.street")
    WebElement addressEl;

    @FindBy(id = "customer.address.city")
    WebElement cityEl;

    @FindBy(id = "customer.address.state")
    WebElement stateEl;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCodeEl;

    @FindBy(id = "customer.ssn")
    WebElement ssnEl;

    @FindBy(css = "input.button[value='Register']")
    WebElement registerBtn;

    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumberEl;

    @FindBy(id = "customer.username")
    WebElement usernameEl;

    @FindBy(id = "customer.password")
    WebElement passwordEl;

    @FindBy(id = "repeatedPassword")
    WebElement repeatedPasswordEl;

    @FindBy(css = "#rightPanel > p:nth-child(2)")
    WebElement message;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public RegisterPage fillFirstName(String firstName) {
        GeneralSeleniumBatchFour.domStable();
        firstNameEl.isDisplayed();
        firstNameEl.clear();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName) {
        lastNameEl.isDisplayed();
        lastNameEl.clear();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public RegisterPage fillAddress(String address) {
        addressEl.isDisplayed();
        addressEl.clear();
        addressEl.sendKeys(address);
        return this;
    }

    public RegisterPage fillCity(String city) {
        cityEl.isDisplayed();
        cityEl.clear();
        cityEl.sendKeys(city);
        return this;
    }


    public RegisterPage fillState(String state) {
        stateEl.isDisplayed();
        stateEl.clear();
        stateEl.sendKeys(state);
        return this;
    }

    public RegisterPage fillZipCode(String zipCode) {
        zipCodeEl.isDisplayed();
        zipCodeEl.clear();
        zipCodeEl.sendKeys(zipCode);
        return this;
    }

    public RegisterPage fillPhoneNumber(String phoneNumber) {
        phoneNumberEl.isDisplayed();
        phoneNumberEl.clear();
        phoneNumberEl.sendKeys(phoneNumber);
        return this;
    }


    public RegisterPage fillSsn(String ssn) {
        ssnEl.isDisplayed();
        ssnEl.clear();
        ssnEl.sendKeys(ssn);
        return this;
    }

    public RegisterPage fillUsername(String username) {
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword) {
        repeatedPasswordEl.isDisplayed();
        repeatedPasswordEl.clear();
        repeatedPasswordEl.sendKeys(confirmPassword);
        return this;
    }

    public RegisterPage clickRegisterBtn() {
        registerBtn.isDisplayed();
        registerBtn.click();
        return this;
    }

    public boolean hasMessage() {
        return message.isDisplayed();
    }

}
