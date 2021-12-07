package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement logIn;
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOut;


    public void clickOnLogin() {clickOnElement(logIn);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");}

    public void clickOnLogout(){clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS,"Click on logout");
    }
    public String getTextLogIn(){
        String message = getTextFromElement(logIn);
        CustomListeners.test.log(Status.PASS,"Get Text Login");
        return message;
    }


}
