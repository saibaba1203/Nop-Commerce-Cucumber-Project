package com.nopcommerce.demo.pages;

import nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting Welcome text  : " + welcomeText.toString());
        return message;
    }

    public void verifyWelcomeText(String text){
        verifyThatTextIsDisplayed(welcomeText,text);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
        log.info("Entering Email: " + emailField.toString());
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
        log.info("Entering Password: " + passwordField.toString());
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking on login button: " + loginButton.toString());
    }

    public String getErrorMessage(){
        String message = getTextFromElement(errorMessage);
        log.info("Verifying Error message : " + errorMessage.toString());
        return message;
    }

    public void verifyInvalidCredentialsErrorMessage(String text){
        verifyThatTextIsDisplayed(errorMessage, text);
        log.info("Verifying error messsage: " + errorMessage.toString());

    }

}

