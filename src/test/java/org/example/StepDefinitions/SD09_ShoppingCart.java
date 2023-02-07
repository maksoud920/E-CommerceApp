package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.testng.asserts.SoftAssert;

public class SD09_ShoppingCart {

    P04_home Home = new P04_home();

    @Given("User open books category page")
    public void OpenBooks()
    {
        Home.Books().click();
    }

    @When("User press on Add To Cart button on three different books")
    public void AddToCart() throws InterruptedException {
        Home.AddToCartButton().get(0).click();
        Thread.sleep(1000);
        Home.AddToCartButton().get(1).click();
        Thread.sleep(1000);
        Home.AddToCartButton().get(2).click();
        Thread.sleep(4000);
    }

    @Then("Items should be added to the Shopping cart")
    public void CheckCart()
    {
        String Count = Home.CartCount().getText();

        //Assertions
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Count.equals("(3)"));

        soft.assertAll();
    }
}
