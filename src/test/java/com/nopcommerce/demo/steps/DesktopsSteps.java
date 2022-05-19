package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DesktopsSteps {
    @And("^I click on Desktops Link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("^I should navigate to Desktops Page$")
    public void iShouldNavigateToDesktopsPage() {
    }

    @And("^Verify Desktops text$")
    public void verifyDesktopsText() {
        String expectedMessage="Desktops";
        Assert.assertEquals("Desktops :",expectedMessage,new DesktopPage().getTextOfDesktops());
    }

    @And("^I click on product name Build your own computer$")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnComputerLink();
    }



    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String Processor)  {
        new DesktopPage().selectProcessor(Processor);
    }

    @And("^I Select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String Ram)  {
        new DesktopPage().selectRam(Ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String HDD)  {
        new DesktopPage().selectHDDRadioButtons(HDD);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String OS)  {
        new DesktopPage().selectOSRadioButtons(OS);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String Software)  {
        new DesktopPage().selectSoftwareRadioButtons(Software);
    }

    @Then("^I click on ADD TO CART Button$")
    public void iClickOnADDTOCARTButton() {
        new DesktopPage().clickOnAddToCartButton();
    }
    @And("^I verify message The product has been added to your shopping cart$")
    public void iVerifyMessageTheProductHasBeenAddedToYourShoppingCart() {
        String expectedMessage="The product has been added to your shopping cart";
        Assert.assertEquals("Added to the Cart: ",expectedMessage,new DesktopPage().getTextOfProductAddedToTheCartMessage());
    }
}
