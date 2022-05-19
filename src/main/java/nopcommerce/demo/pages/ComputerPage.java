package com.nopcommerce.demo.pages;

import nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Software']")
    WebElement softwareLink;



    public void verifyComputerText(String text){
        verifyThatTextIsDisplayed(computersText, "Computers");
        log.info("Verifying Computer text: " + computersText.toString());
    }

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
        log.info("Clicking on desktop link: " + desktopLink.toString());
    }

    public void clickOnNotebooksLink(){
        clickOnElement(notebooksLink);
        log.info("Clicking on Notebooks link: " + notebooksLink.toString());

    }

    public void clickOnSoftwareLink(){
        clickOnElement(softwareLink);
        log.info("Clicking on Software link: " + softwareLink.toString());

    }


}
