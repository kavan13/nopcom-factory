package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

//. RegisterPageTest
//Inside RegisterPageTest class create following testmethods
//1. verifyUserShouldNavigateToRegisterPageSuccessfully()
// Click on Register Link
// Verify "Register" text
//2. verifyThatFirstNameLastNameEmailOasswordAndConfirmPasswordFieldsAreMandetory()
// Click on Register Link
// Click on "REGISTER" button
// Verify the error message "First name is required."
// Verify the error message "Last name is required."
// Verify the error message "Email is required."
// Verify the error message "Password is required."
// Verify the error message "Password is required."
@Listeners(CustomListeners.class)
public class RegisterPageTest extends TestBase {
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt1() {
        registerPage= new RegisterPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
       registerPage.clickOnRegisterTab();
       Thread.sleep(1000);
        String expectedMessage = "Register";
        String actualMessage = registerPage.getVerifyTextRegister();
        Assert.assertEquals(expectedMessage, actualMessage,"please Register");

    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailOasswordAndConfirmPasswordFieldsAreMandetory() throws InterruptedException {
        registerPage.clickOnRegisterTab();
        Thread.sleep(1000);
        registerPage.clickRegisterButton1();
        String expectedMessage = "First name is required.";
        String actualMessage = registerPage.getErrorTextFirstName();
        Assert.assertEquals(expectedMessage, actualMessage,"Error Massage");

        Thread.sleep(1000);
        String expectedMessage1 = "Last name is required.";
        String actualMessage1 = registerPage.getErrorTextLastName();
        Assert.assertEquals(expectedMessage1, actualMessage1,"Error message");

        Thread.sleep(1000);
        String expectedMessage2 = "Email is required.";
        String actualMessage2 = registerPage.getErrorTextEmail();
        Assert.assertEquals(expectedMessage2, actualMessage2,"Error message");

        Thread.sleep(1000);
        String expectedMessage3 = "Password is required.";
        String actualMessage3 = registerPage.getErrorTextPassword();
        Assert.assertEquals(expectedMessage3, actualMessage3,"Error message");

        Thread.sleep(1000);
        String expectedMessage4 = "Password is required.";
        String actualMessage4 = registerPage.getErrorTextConfirmPassword();
        Assert.assertEquals(expectedMessage4, actualMessage4,"Error message");

    }
    // VerifyThatUserShouldCreateAccountSuccessfully()
    // Click on Register Link
    // Select gender "Female"
    // Enter firstname
    // Enter lastname
    // Select day
    // Select month
    // Select year
    // Enter email
    // Enter password
    // Enter Confirm Password
    // Click on "REGISTER" button
    // Verify message "Your registration completed"
    @Test(groups = {"regression1","regression"})
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        registerPage.clickOnRegisterTab();
        Thread.sleep(1000);
        registerPage.selectRadioButtonMale();
        registerPage.typeFirstName("kavan");
        registerPage.typeLastName("Patel");
        Thread.sleep(1000);
        registerPage.selectDay(3);
        registerPage.selectMonth(5);
        registerPage.selectYear(6);
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);
        registerPage.typeEmail("kavan"+randomGenerator+"@gmail.com");
        Thread.sleep(1000);
        registerPage.typePassword("Xyz12345");
        registerPage.typeConfirmPassword("Xyz12345");
        registerPage.clickRegisterButton1();
        Thread.sleep(1000);
        String expectedMessage7 = "Your registration completed";
        String actualMessage7 = registerPage.getverifyMessageYourRegistrationCompleted();
        Assert.assertEquals(expectedMessage7, actualMessage7,"please sign in");


    }

}
