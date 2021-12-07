package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    WebElement computerLink;
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement textComputer;
    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//a[text()=' Desktops ']")
    WebElement desktopLink;

    public void clickOnComputerlink() {
        clickOnElement(computerLink);
        //Reporter.log("Clicking on Computer Link"+computerLink.toString()+"<br>");
        CustomListeners.test.log(Status.PASS,"Click on Computer Link");
    }

    public String getTextComputer() {
       // Reporter.log("Get Text of Computer Link"+textComputer.toString()+"<br>");
        String message = getTextFromElement(textComputer);
        CustomListeners.test.log(Status.PASS,"Get Text Computer");
        return message;
    }
   public void clickOnDesktopLink(){clickOnElement(desktopLink);
     //  Reporter.log("Clicking on Desktop Link"+desktopLink.toString()+"<br>");
       CustomListeners.test.log(Status.PASS,"Click on Desktop Link");
    }
}
