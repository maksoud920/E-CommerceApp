package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_resetPassword;
import org.example.PublicVariables.PublicVars;
import org.testng.asserts.SoftAssert;

public class SD03_ResetPassword {

    P03_resetPassword reset = new P03_resetPassword();

    @And("User press on forgot password")
    public void resetPassword()
    {
        reset.Forget().click();
    }

    @When("User enters his or her email")
    public void Email()
    {
        reset.Email().sendKeys(PublicVars.Email);

    }
    @And("User press Recover button")
    public void Recover(){
        reset.RecoverButton().click();
    }

    @Then("User could reset password successfully")
    public void SuccessMsg()
    {
        //Assertions
        SoftAssert soft = new SoftAssert();
        String ExpectedResult = "Email with instructions has been sent to you.";
        String ActualResult = reset.Msg().getText();
        soft.assertTrue(ActualResult.contains(ExpectedResult));

        soft.assertAll();
    }

}
