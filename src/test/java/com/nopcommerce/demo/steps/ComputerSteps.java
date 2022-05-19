package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on Computer Tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerLink();

    }

    @Then("^I should navigate to Computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }


    @And("^Verify Computer text$")
    public void verifyComputerText() {
        String expectedMessage="Computers";
        Assert.assertEquals("Computers Text: ",expectedMessage,new ComputerPage().getTextOfComputer());
    }
}
