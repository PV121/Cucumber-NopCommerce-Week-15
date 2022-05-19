package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.time.Year;

public class RegistrationSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new RegistrationPage().clickOnRegisterLink();
    }

    @And("^I should navigate to registration page successfully$")
    public void iShouldNavigateToRegistrationPageSuccessfully() {
        String expectedMessage = "Register";
        Assert.assertEquals("User is not on Registration Page: ",expectedMessage,new RegistrationPage().getTextOfRegister());
    }

    @And("^I click on register Button$")
    public void iClickOnRegisterButton() {
        new RegistrationPage().clickOnRegisterButton();
    }


    @And("^verify error message firstname is required$")
    public void verifyErrorMessageFirstnameIsRequired() {
        String expectedMessageOfFirstname="First name is required.";
        Assert.assertEquals("FistName Required:",expectedMessageOfFirstname,new RegistrationPage().getErrorMessageOfFisrtName());
    }

    @And("^Verify the error message Last name is required$")
    public void verifyTheErrorMessageLastNameIsRequired() {
        String expectedMessageOfLaststname="Last name is required.";
        Assert.assertEquals("LastName Required:",expectedMessageOfLaststname,new RegistrationPage().getErrorMessageOfLastName());
    }

    @And("^Verify the error message Email is required$")
    public void verifyTheErrorMessageEmailIsRequired() {
        String expectedMessageOfEmail="Email is required.";
        Assert.assertEquals("Email required:",expectedMessageOfEmail,new RegistrationPage().getErrorMessageOfEmail());
    }

    @And("^Verify the error message Password is required$")
    public void verifyTheErrorMessagePasswordIsRequired() {
        String expectedMessageOfPassword="Password is required.";
        Assert.assertEquals("Password required:",expectedMessageOfPassword,new RegistrationPage().getErrorMessageOfPassword());
    }

    @And("^Verify the error message Confirm Password is required$")
    public void verifyTheErrorMessageConfirmPasswordIsRequired() {
        String expectedMessageOfConfirmPassword="Password is required.";
        Assert.assertEquals("Confirm Password required: ",expectedMessageOfConfirmPassword,new RegistrationPage().getErrorMessageOfConfirmPassword());
    }


    @And("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String Gender) {
      if (Gender.equalsIgnoreCase("Male")){
          new RegistrationPage().clickOnMaleGenderRadioButton();
      }
      else{
          new RegistrationPage().clickOnFemaleGenderRadioButton();
      }
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String Firstname)  {
        new RegistrationPage().enterFirstName(Firstname);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String Lastname)  {
        new RegistrationPage().enterLastName(Lastname);
    }

    @And("^I select day \"([^\"]*)\"$")
    public void iSelectDay(String Day)  {
        new RegistrationPage().clickOnDateOfBDay(Day);
    }

    @And("^I select month\"([^\"]*)\"$")
    public void iSelectMonth(String Month)  {
        new RegistrationPage().selectMonthOfBDay(Month);
    }

    @And("^I select year \"([^\"]*)\"$")
    public void iSelectYear(String Year)  {
        new RegistrationPage().selectYearOfBDay(Year);
    }

    @And("^I enter emailId \"([^\"]*)\"$")
    public void iEnterEmailId(String Email )  {
        new RegistrationPage().enterEmailID(Email);
    }

    @And("^I enter Reg-Password \"([^\"]*)\"$")
    public void iEnterRegPassword(String Password)  {
        new RegistrationPage().enterPassword(Password);
    }

    @And("^I enter Reg-ConfirmPassword\"([^\"]*)\"$")
    public void iEnterRegConfirmPassword(String ConfirmPassword)  {
        new RegistrationPage().enterConfirmPassword(ConfirmPassword);
    }

    @And("^Verify the message Your registration completed$")
    public void verifyTheMessageYourRegistrationCompleted() {
        String expectedMessage="Your registration completed";
        Assert.assertEquals("Registration Unsucceful: ",expectedMessage,new RegistrationPage().getTextFromRegistrationSuccessful());
    }
}
