package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationPage.class);

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Register')]")
    WebElement registrationLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerMessage;

    @CacheLookup
    @FindBy (xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleGenderRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleGenderRadioButton;

    @CacheLookup
    @FindBy(name = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(name = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBDay;

    @CacheLookup
    @FindBy(name= "DateOfBirthMonth")
    WebElement monthOfBDay;

    @CacheLookup
    @FindBy(name="DateOfBirthYear")
    WebElement yearOfBDay;


    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageOfFirstName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorMessageOfLastName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement errorMessageOfEmail;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorMessageOfPassword;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorMessageOfConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement regEmailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement textOfRegistrationSuccessfulMessage;

    public void enterEmailID(String Email){
        log.info("Sending "+Email+"to"+regEmailId.toString());
        sendTextToElement(regEmailId,Email);
    }

    public void enterPassword(String Password){
        log.info("Sending "+Password+"to"+password.toString());
        sendTextToElement(password,Password);
    }
    public void enterConfirmPassword(String ConfirmPassword){
        log.info("Sending "+ConfirmPassword+"to"+confirmPassword.toString());
        sendTextToElement(confirmPassword,ConfirmPassword);
    }

    public void clickOnRegisterLink(){
        log.info("Clicking on registration link "+registrationLink.toString());
        clickOnElement(registrationLink);
    }
    public String getTextOfRegister(){
        log.info("Getting Register message from "+registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public void clickOnRegisterButton(){
        log.info("Clicking on registration button "+registerButton.toString());
        clickOnElement(registerButton);
    }
    public String getErrorMessageOfFisrtName(){
        log.info("Getting error message of firstname from "+errorMessageOfFirstName.toString());
        return getTextFromElement(errorMessageOfFirstName);
    }
    public String getErrorMessageOfLastName(){
        log.info("Getting error message of lastname from "+errorMessageOfLastName.toString());
        return getTextFromElement(errorMessageOfLastName);
    }
    public String getErrorMessageOfEmail(){
        log.info("Getting error message of email from "+errorMessageOfEmail.toString());
        return getTextFromElement(errorMessageOfEmail);
    }
    public String getErrorMessageOfPassword(){
        log.info("Getting error message of password from "+errorMessageOfPassword.toString());
        return getTextFromElement(errorMessageOfPassword);
    }
    public String getErrorMessageOfConfirmPassword(){
        log.info("Getting error message of Confirm password from "+errorMessageOfConfirmPassword.toString());
        return getTextFromElement(errorMessageOfConfirmPassword);
    }

 public void clickOnFemaleGenderRadioButton(){
     log.info("Clicking on female Gender Radio Button "+femaleGenderRadioButton.toString());
     clickOnElement(femaleGenderRadioButton);
    }
    public void clickOnMaleGenderRadioButton(){
        log.info("Clicking on male Gender Radio Button "+maleGenderRadioButton.toString());
        clickOnElement(maleGenderRadioButton);
    }
    public void enterFirstName(String firstname){
        log.info("Sending "+firstname+ " to "+firstName.toString());
        sendTextToElement(firstName,firstname);
    }
    public void enterLastName(String lastname){
        log.info("Sending "+lastname+ " to "+lastName.toString());
        sendTextToElement(lastName,lastname);
    }
    public void clickOnDateOfBDay(String day){
        log.info("Selecting Date of the B.day :"+dateOfBDay.toString());
        selectByVisibleTextFromDropDown(dateOfBDay,day);
    }
    public void selectMonthOfBDay(String Month){
        log.info("Selecting Month of the B.day :"+monthOfBDay.toString());
        selectByVisibleTextFromDropDown(monthOfBDay,Month);
    }

    public void selectYearOfBDay(String year){
        log.info("Selecting Year of the B.day :"+yearOfBDay.toString());
        selectByVisibleTextFromDropDown(yearOfBDay,year);
    }

    public String getTextFromRegistrationSuccessful(){
        log.info("Getting text Of Registration Successful Message "+textOfRegistrationSuccessfulMessage.toString());
        return textOfRegistrationSuccessfulMessage.getText();
    }
}

