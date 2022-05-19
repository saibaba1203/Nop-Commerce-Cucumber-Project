package com.nopcommerce.demo.pages;

import nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement getLoginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement getRegisterLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement getNopCommerceLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement getmyAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement getlogoutLink;


    public void clickOnLoginLink() {
        clickOnElement(getLoginLink);
        log.info("Clicking on login link : " + getLoginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(getRegisterLink);
        log.info("Clicking on register link : " + getRegisterLink.toString());
    }

    public void verifyNopCommerceLogoVisible(){
        verifyLogoVisible(getNopCommerceLogo);
        log.info("Verify Logo is visible : " + getNopCommerceLogo.toString());
    }

    public void clickOnLogoutLink(){
        clickOnElement(getlogoutLink);
        log.info("Clicking on logout link : " + getlogoutLink.toString());
    }

    public void verifyLogoutlinkVisible(){
        verifyThatElementIsDisplayed(getlogoutLink);
        log.info("Verifying logout link is displayed : " + getlogoutLink.toString());
    }

    public void verifyLoginLinkVisible(){
        verifyThatElementIsDisplayed(getLoginLink);
        log.info("Verifying login link is displayed : " + getLoginLink.toString());

    }


    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

}