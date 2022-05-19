package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();//nameless object and implement a method

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed",expectedMessage,actualMessage);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }
    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {

    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage){
        Assert.assertEquals("Error message not displayed", errorMessage,new LoginPage().getErrorMessage());
    }

    @And("^I should see the LogOut link$")
    public void iShouldSeeTheLogOutLink() {
        String expectedMessage= "Log out";
        Assert.assertEquals("LogOut link not displayed: ",expectedMessage,new LoginPage().getTextLogOutLink());
    }

    @And("^I should click on logout link$")
    public void iShouldClickOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("^I should see LogIn link$")
    public void iShouldSeeLogInLink() {
        String expectedMessage= "Log in";
        Assert.assertEquals("Login Link not displayed: ",expectedMessage,new HomePage().getTextOfLogInLink());

    }
}
