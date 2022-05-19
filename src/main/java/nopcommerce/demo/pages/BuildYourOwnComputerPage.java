package nopcommerce.demo.pages;

import nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement selectHdd;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_4']")
    WebElement selectOperatingSystem;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5']")
    WebElement selectSoftware;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[contains(.,'The product has been added to your shopping cart')]")
    WebElement productAddedToCartMessage;


    public void verifyBuildYourComputerText(String text) {
        verifyThatTextIsDisplayed(buildYourOwnComputerText, text);
        log.info("Verifying Build your own computer text: " + buildYourOwnComputerText.toString());
    }

    public void selectProcessorFromDropdown(String processor) {
        selectByVisibleTextFromDropDown(processorDropdown, processor);
        log.info("Selecting processor from dropdown: " + processorDropdown.toString());
    }

    public void selectRamFromDropdown(String ram) {
        selectByVisibleTextFromDropDown(ramDropdown, ram);
        log.info("Selecting RAM from dropdown: " + ramDropdown.toString());
    }

    public void selectHdd(String hdd) {
        clickOnElement(selectHdd, hdd);
        log.info("Selecting HDD from dropdown: " + selectHdd.toString());
    }

    public void selectOperatingSystem(String os){
        clickOnElement(selectOperatingSystem,os);
        log.info("Selecting OS: " + selectOperatingSystem.toString());
    }

    public void selectSoftware(String software){
        clickOnElement(selectSoftware, software);
        log.info("Selecting Software: " + software.toString());
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
        log.info("Clicking on Add To Cart Button: " + addToCartButton.toString());
    }

    public void verifyProductAddedToCartMessage(String text){
        verifyThatTextIsDisplayed(productAddedToCartMessage, text);
        log.info("Verifying Product added to cart message: " + productAddedToCartMessage.toString());
    }


//    public void buildConfigurationFromList(String processor, String ram, String hdd, String os, String software){
//        selectByVisibleTextFromDropDown(processorDropdown, processor);
//
//        selectByVisibleTextFromDropDown(ramDropdown, ram);
//
//        clickOnElement(selectHdd, hdd);
//
//        clickOnElement(selectOperatingSystem,os);
//
//        clickOnElement(selectSoftware, software);
//
//    }



}
