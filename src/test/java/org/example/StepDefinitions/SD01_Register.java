package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_register;
import org.example.PublicVariables.PublicVars;
import org.junit.Assert;

public class SD01_Register {


    P01_register register = new P01_register();

    @Given("User go to register page")
    public void gotoRegisterPage()
    {
        register.registerButton().click();
    }

    @When("User enter first name, second name, email and password")
    public void enter_validData()
    {
        register.FirstName().sendKeys("Ahmed");
        register.LastName().sendKeys("Mohamed");
        register.Email().sendKeys(PublicVars.Email);
        register.Password().sendKeys(PublicVars.Password);
        register.ConfirmPassword().sendKeys(PublicVars.Password);
    }

    @And("User press on register button")
    public void Register_Button()
    {
        register.registerConfirmButton().click();
    }

    @Then("User could register successfully")
    public void SuccessRegister()
    {
        String ExpectedResult = "Your registration completed";
        String ActualResult = register.registerMsg().getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }


}