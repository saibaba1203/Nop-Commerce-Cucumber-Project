package nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nopcommerce.demo.pages.BuildYourOwnComputerPage;

public class ComputersSteps {

    @When("^I click on Computers tab$")
    public void iClickOnComputersTab() {
        new HomePage().selectMenu("Computers");
    }

    @Then("^I should navigate to Computers page successfully$")
    public void iShouldNavigateToComputersPageSuccessfully() {
        new ComputerPage().verifyComputerText("Computers");
    }


    @And("^I click on Desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("^I should navigate to Desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        new DesktopsPage().verifyDesktopText("Desktops");
    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product)  {
        new DesktopsPage().selectProductFromDesptopPage(product);

    }

    @And("^I select \"([^\"]*)\" from Processor dropdown$")
    public void iSelectFromProcessorDropdown(String processor)  {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("^I select \"([^\"]*)\" from Ram dropdown$")
    public void iSelectFromRamDropdown(String ram)  {
        new BuildYourOwnComputerPage().selectRamFromDropdown(ram);
    }

    @And("^I select \"([^\"]*)\" from HDD options$")
    public void iSelectFromHDDOptions(String hdd)  {
        new BuildYourOwnComputerPage().selectHdd(hdd);
    }

    @And("^I select \"([^\"]*)\" from OS options$")
    public void iSelectFromOSOptions(String os)  {
        new BuildYourOwnComputerPage().selectOperatingSystem(os);
    }

    @And("^I select \"([^\"]*)\" from Software options$")
    public void iSelectFromSoftwareOptions(String software)  {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^Product is added to cart successfully$")
    public void productIsAddedToCartSuccessfully() {
        new BuildYourOwnComputerPage().verifyProductAddedToCartMessage("The product has been added to your shopping cart");
    }
}
