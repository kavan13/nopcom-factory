package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPage() throws InterruptedException {
        homePage.clickOnLogin();
        Thread.sleep(1000);
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");


    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyErrorMessageWithInvalidCredentials() throws InterruptedException {
        homePage.clickOnLogin();
        Thread.sleep(1000);
        loginPage.enterEmailId("kavan234@gmail.com");
        loginPage.enterPassword("Kavan234");
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");


    }
    @Test(groups = {"smoke","sanity","regression1","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
         homePage.clickOnLogin();
         loginPage.enterEmailId("kavan13@gmail.com");
         loginPage.enterPassword("Xya12345");
         loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedMessage = "Log out";
        String actualMessage = loginPage.getTextLogout();
        Assert.assertEquals(expectedMessage, actualMessage, "Logout Link displayed");

    }
    @Test(groups = {"regression1","regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.clickOnLogin();
        Thread.sleep(1000);
        loginPage.enterEmailId("kavan13@gmail.com");
        loginPage.enterPassword("abcd123");
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        homePage.clickOnLogout();
        String expectedMessage = "Log in";
        String actualMessage = homePage.getTextLogIn();
        Assert.assertEquals(actualMessage, expectedMessage, "LogIn Link displayed");


    }


}