package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    public DesktopsPage() {PageFactory.initElements(driver, this);}
    @FindBy (xpath = "//h1[contains(text(),'Desktops')]")
    WebElement textDesktop;
    @FindBy(xpath = "//div[@class='item-box'][1]//button[text()='Add to cart']")
    WebElement buildYourOwnComputerAddCart;




    public String getTextDesktops() {
        String message=getTextFromElement(textDesktop);
        CustomListeners.test.log(Status.PASS,"Get DesktopText");
        return message;
    }
public void clickOnBuildYourOwnComputer()
{
   mouseHoverAndClickToElement(buildYourOwnComputerAddCart);
    CustomListeners.test.log(Status.PASS,"click Build own computer ");

}

}
