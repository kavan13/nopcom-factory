package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement register;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement genderMale;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayOfBirth;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirth;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyMessageYourRegistrationCompleted;

    //xparth for empty register field
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageForFirstName;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorMessageForLasttName;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement errorMessageForEmail;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorMessageForPassword;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorMessageForConfirmPassword;


    public void clickOnRegisterTab() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS,"click On Register");
    }

    public String getVerifyTextRegister() {
        String message= getTextFromElement(registerText);
        CustomListeners.test.log(Status.PASS,"Get Text Register");
        return message;
    }

    public void selectRadioButtonMale() {
        clickOnElement(genderMale);
        CustomListeners.test.log(Status.PASS,"Click On Radio Button");
    }

    public void typeFirstName(String name) {
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS,"Enter First Name " + name);

    }

    public void typeLastName(String name) {
        sendTextToElement(lastname, name);
        CustomListeners.test.log(Status.PASS,"Enter Last Name " + name);

    }

    public void selectDay(int value) {
        selectByIndexFromDropDown(dayOfBirth, value);
        CustomListeners.test.log(Status.PASS,"Select Day " + value);

    }

    public void selectMonth(int value) {
        selectByIndexFromDropDown(monthOfBirth, value);
        CustomListeners.test.log(Status.PASS,"Select Month" + value);

    }

    public void selectYear(int value) {
        selectByIndexFromDropDown(yearOfBirth, value);
        CustomListeners.test.log(Status.PASS,"Select Year " + value);

    }

    public void typeEmail(String id) {
        sendTextToElement(email, id);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + id);

    }

    public void typePassword(String text) {
        sendTextToElement(password, text);
        CustomListeners.test.log(Status.PASS,"Enter Password" + text);

    }

    public void typeConfirmPassword(String text) {
        sendTextToElement(confirmPassword, text);
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password " + text);

    }

    public void clickRegisterButton1() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click On Register Button");
    }

    public String getverifyMessageYourRegistrationCompleted() {
        String message =getTextFromElement(verifyMessageYourRegistrationCompleted);
        CustomListeners.test.log(Status.PASS,"Get Text Your Message Registration Completed");
        return message;
    }

// method for register error message

    public String getErrorTextFirstName() {
        String message= getTextFromElement(errorMessageForFirstName);
        CustomListeners.test.log(Status.PASS,"Get ErrorTextFirstName");
        return message;
    }

    public String getErrorTextLastName() {
        String message =getTextFromElement(errorMessageForLasttName);
        CustomListeners.test.log(Status.PASS,"Get ErrorTextLastName");
        return message;
    }

    public String getErrorTextEmail() {
        String message= getTextFromElement(errorMessageForEmail);
        CustomListeners.test.log(Status.PASS,"Get ErrorTextEmail");
        return message;
    }

    public String getErrorTextPassword() {
        String message=getTextFromElement(errorMessageForPassword);
        CustomListeners.test.log(Status.PASS,"Get ErrorTextPassword");
        return message;
    }

    public String getErrorTextConfirmPassword() {
        String message =getTextFromElement(errorMessageForConfirmPassword);
        CustomListeners.test.log(Status.PASS,"Get ErrorTextConfirmPassword");
        return message;
    }


}
