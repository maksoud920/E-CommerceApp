package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_login;
import org.example.PublicVariables.PublicVars;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class SD02_Login {

    P02_login login = new P02_login();

    @Given("User go to login page")
    public void login() throws InterruptedException {
        login.LoginButton().click();
        Thread.sleep(3000);

    }

    @When("User enter valid email and password")
    public void validData()
    {
        login.Email().sendKeys(PublicVars.Email);
        login.Password().sendKeys(PublicVars.Password);
    }

    @And("User click on login button")
    public void loginButton() throws InterruptedException {
        Thread.sleep(3000);
        login.loginConfirmButton().sendKeys(Keys.ENTER);
    }

    @Then("User could login successfully")
    public void SuccessLogin()
    {
        //Assertions
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(login.MyAccountButton().isDisplayed());

        soft.assertAll();

    }

    @When("User enter invalid email or password")
    public void invalidData()
    {
        login.Email().sendKeys("wrong@gmail.com");
        login.Password().sendKeys(PublicVars.Password);
    }

    @Then("User couldn't login to the system")
    public void unSuccessLogin()
    {
        //Assertions
        SoftAssert soft = new SoftAssert();
        String ExpectedResult = "Login was unsuccessful.";
        String ActualResult = login.ErrorMsg().getText();
        soft.assertTrue(ActualResult.contains(ExpectedResult));
        soft.assertEquals(login.ErrorMsg().getCssValue("color"),"rgba(228, 67, 75, 1)");

        soft.assertAll();

    }


}
