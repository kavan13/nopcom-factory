package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy( xpath="//select[@name='product_attribute_1']")
    WebElement pantiumDual;

    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement select8GB$60;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHDDRadio;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement selectHDDRadio1;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement vistaPremium$60;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement vistaPremium$50;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOffice$50;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement acrobateReader;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander5;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @FindBy(xpath = "//p[@class='content']")
    WebElement addedToYourShoppingcart;

    @FindBy(xpath = "//ul[@class='option-list']")
    WebElement optionList;

    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"Click on Add CartButton");
    }
    public void selectPantiumDualCoreE2200(String value) {
        selectByValueFromDropDown(pantiumDual, value);
        CustomListeners.test.log(Status.PASS,"Select Pantium Core" + value);
    }
   public void setSelect8GB$60ect8GB$60(String value) {
        selectByValueFromDropDown(select8GB$60, value);
       CustomListeners.test.log(Status.PASS,"Select 8Gb" + value);
    }
    public void clickOnOptionList(String value) {
        clickOnElement(optionList);
        CustomListeners.test.log(Status.PASS,"Select Option" + value);
    }

    public void clickOnSelectHDDRadio(String value) {
        clickOnElement(selectHDDRadio);
        CustomListeners.test.log(Status.PASS,"select HDD" + value);
    }
    public void clickOnSelectHDDRadio1(String value) {
        clickOnElement(selectHDDRadio1);
        CustomListeners.test.log(Status.PASS,"Select HDD Radio" + value);
    }

    public void clickOnSelectVistaPremium$60(String value) {
        clickOnElement(vistaPremium$60);
        CustomListeners.test.log(Status.PASS,"Select vista Premium $60" + value);
    }
    public void clickOnSelectVistaPremium$50(String value) {
        clickOnElement(vistaPremium$50);
        CustomListeners.test.log(Status.PASS,"select vista premium$50" + value);
    }

    public void selectMicrosoftOffice$50(String value) {
        clickOnElement(microsoftOffice$50);
        CustomListeners.test.log(Status.PASS,"Select Microsoft" + value);
    }
    public void selectAcrobateReader(String value) {
        clickOnElement(acrobateReader);
        CustomListeners.test.log(Status.PASS,"Select Acrobate" + value);
    }

    public void selectTotalCommander5(String value) {
        clickOnElement(totalCommander5);
        CustomListeners.test.log(Status.PASS,"Select Total Commander5" + value);
    }


    public String getVerifyAddedToYourShoppingcart() {
        String message= getTextFromElement(addedToYourShoppingcart);
        CustomListeners.test.log(Status.PASS,"Get Text AddedToYourShoppingcart ");
        return message;
    }

}
