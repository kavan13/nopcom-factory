package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt2() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    // verifyUserShouldNavigateToComputerPageSuccessfully()
    // Click on Computer tab
    // Verify "Computer" text
    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() throws InterruptedException {
        computerPage.clickOnComputerlink();
        Thread.sleep(1000);
        String expectedMessage = "Computers";
        String actualMessage = computerPage.getTextComputer();
        Assert.assertEquals(expectedMessage, actualMessage, "Verify Text Computer");

    }

    // verifyUserShouldNavigateToDesktopsPageSuccessfully()
    // Click on Computer tab
    // Click on Desktops link
    // Verify "Desktops" text
    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        computerPage.clickOnComputerlink();
        Thread.sleep(1000);
        computerPage.clickOnDesktopLink();
        String expectedMessage = "Desktops";
        String actualMessage = desktopsPage.getTextDesktops();
        Assert.assertEquals(expectedMessage, actualMessage, "Verify Text Desktops");

    }

    // VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String
    //processor, String ram,
    // String hdd, String os, String software)
    // Click on Computer tab
    // Click on Desktops link
    // Click on product name "Build your own computer"
    // Select processor "processor"
    // Select RAM "ram"
    // Select HDD "hdd"
    // Select OS "os"
    // Select Software "software"
    // Click on "ADD TO CART" Button
    // Verify message "The product has been added to your shopping cart"
    //
    // DATA SET
    // | processor | ram | hdd
    // | os | software |
    // | 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB
    // | Vista Home [+$50.00] | Microsoft Office [+$50.00] |
    // | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB
    //[+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00] |
    // | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB
    // | Vista Home [+$50.00] | Total Commander [+$5.00] |

    @Test(dataProvider = "buildyourcomp", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        computerPage.clickOnComputerlink();
        Thread.sleep(1000);
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.selectPantiumDualCoreE2200(processor);
        Thread.sleep(500);
        buildYourOwnComputerPage.setSelect8GB$60ect8GB$60(ram);
        buildYourOwnComputerPage.clickOnSelectHDDRadio(hdd);
        buildYourOwnComputerPage.clickOnSelectVistaPremium$60(os);
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectMicrosoftOffice$50(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = buildYourOwnComputerPage.getVerifyAddedToYourShoppingcart();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Text verify");

    }
}