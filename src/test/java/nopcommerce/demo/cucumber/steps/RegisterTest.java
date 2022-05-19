package nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterTest {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I am on register page$")
    public void iAmOnRegisterPage() {
//        new RegisterPage().verifyRegisterText("Register");
        String expectedMessage = "Register";
        Assert.assertEquals("", expectedMessage, new RegisterPage().getMessage());
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I get error message 'First name is required'$")
    public void iGetErrorMessageFirstNameIsRequired() {
        new RegisterPage().verifyFirstNameReqiredErrorText("First name is required.");
    }

    @And("^I get error message 'Last name is required'$")
    public void iGetErrorMessageLastNameIsRequired() {
        new RegisterPage().verifyLastNameReqiredErrorText("Last name is required.");
    }

    @And("^I get error message 'Email is required'$")
    public void iGetErrorMessageEmailIsRequired() {
        new RegisterPage().verifyEmailReqiredErrorText("Email is required.");
    }

    @And("^I get error message 'Password is required'$")
    public void iGetErrorMessagePasswordIsRequired() {
        new RegisterPage().verifyPasswordReqiredErrorText("Password is required.");
    }

    @And("^I get error message 'Confirm Password is required'$")
    public void iGetErrorMessageConfirmPasswordIsRequired() {
        new RegisterPage().verifyConfirmPasswordReqiredErrorText("Password is required.");
    }


    @Then("^I am not able to register successfully$")
    public void iAmNotAbleToRegisterSuccessfully() {
    }

    @And("^I click on Gender \"([^\"]*)\"$")
    public void iClickOnGender(String male)  {
        new RegisterPage().selectGender(male);

    }

    @And("^I enter First Name \"([^\"]*)\" into 'First name' field$")
    public void iEnterFirstNameIntoFirstNameField(String firstName)  {
        new RegisterPage().inputFirstName(firstName);
    }

    @And("^I enter Last Name \"([^\"]*)\" into 'Last name' field$")
    public void iEnterLastNameIntoLastNameField(String lastName)  {
        new RegisterPage().inputLastName(lastName);
    }

    @And("^I select day \"([^\"]*)\" for 'Date of birth' field$")
    public void iSelectDayForDateOfBirthField(String day)  {
        new RegisterPage().selectDayforDOBField(day);
    }

    @And("^I select month \"([^\"]*)\" for 'Date of birth' field$")
    public void iSelectMonthForDateOfBirthField(String month)  {
        new RegisterPage().selectMonthForDOBField(month);
    }

    @And("^I select year \"([^\"]*)\" for 'Date of birth' field$")
    public void iSelectYearForDateOfBirthField(String year)  {
        new RegisterPage().selectYearForDOBField(year);
    }

    @And("^I enter email \"([^\"]*)\" into 'Email' field$")
    public void iEnterEmailIntoEmailField(String email)  {
        new RegisterPage().inputEmail(email);
    }

    @And("^I enter password \"([^\"]*)\" in 'Password' field$")
    public void iEnterPasswordInPasswordField(String password)  {
        new RegisterPage().inputPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\" into 'Confirm password' field$")
    public void iEnterConfirmPasswordIntoConfirmPasswordField(String confirmPassword)  {
        new RegisterPage().inputConfirmPassword(confirmPassword);
    }

    @Then("^I am able to register successfully$")
    public void iAmAbleToRegisterSuccessfully() {
        new RegisterPage().verifyRegistrationCompletedText("Your registration completed");
    }
}
