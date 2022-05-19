package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {

    private static final Logger log= LogManager.getLogger(DesktopPage.class.getName());
    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourOwnComputerLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDownMenu;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDownMenu;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hDD400GBRadiobutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hDD320GBRadiobutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osHomeRadiobutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osPremiumRadiobutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement msOfficeSoftwareRadiobutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement acrobatReaderSoftwareRadiobutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderSoftwareRadiobutton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedToTheCartMessage ;

    public String getTextOfDesktops() {
        log.info("Getting Text from "+desktopsText.toString());
        return getTextFromElement(desktopsText);
    }
    public void clickOnBuildYourOwnComputerLink(){
        log.info("Click on "+buildYourOwnComputerLink.toString());
        clickOnElement(buildYourOwnComputerLink);
    }
    public void selectProcessor(String processor){
        log.info("Selecting processor: "+processorDropDownMenu.toString());
        selectByVisibleTextFromDropDown(processorDropDownMenu,processor);
    }
    public void selectRam(String ram){
        log.info("Selecting ram: "+ramDropDownMenu.toString());
        selectByVisibleTextFromDropDown(ramDropDownMenu,ram);
    }
    public void selectHDDRadioButtons(String HDD){


        if(HDD.equalsIgnoreCase("320 GB")){
            log.info("click on: "+hDD320GBRadiobutton.toString());
            clickOnElement(hDD320GBRadiobutton);
        }else{
            log.info("click on: "+hDD400GBRadiobutton.toString());
            clickOnElement(hDD400GBRadiobutton);
        }

    }
    public void selectOSRadioButtons(String OS){
        if (OS.equalsIgnoreCase("Vista Home [+$50.00])")){
            log.info("click on: "+osHomeRadiobutton.toString());
            clickOnElement(osHomeRadiobutton);
        }else{
            log.info("click on: "+osPremiumRadiobutton.toString());
            clickOnElement(osPremiumRadiobutton);
        }
    }
    public void selectSoftwareRadioButtons(String Software){
        if (Software.equalsIgnoreCase("Microsoft Office [+$50.00]")){
            log.info("click on: "+msOfficeSoftwareRadiobutton.toString());
            clickOnElement(msOfficeSoftwareRadiobutton);
        }else if (Software.equalsIgnoreCase("| Acrobat Reader [+$10.00]")){
            log.info("click on: "+acrobatReaderSoftwareRadiobutton.toString());
            clickOnElement(acrobatReaderSoftwareRadiobutton);
        }else {
            log.info("click on: "+totalCommanderSoftwareRadiobutton.toString());
            clickOnElement(totalCommanderSoftwareRadiobutton);
        }
    }
    public void clickOnAddToCartButton(){
        log.info("click on: "+addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
    public String getTextOfProductAddedToTheCartMessage(){
        log.info("Getting Text from "+productAddedToTheCartMessage.toString());
        return productAddedToTheCartMessage.getText();
    }


}
