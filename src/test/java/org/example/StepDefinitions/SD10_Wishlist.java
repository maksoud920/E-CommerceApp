package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.testng.asserts.SoftAssert;

public class SD10_Wishlist {

    P04_home Home = new P04_home();

    @When("User press on add to Wishlist button on three different books")
    public void AddToWishlist() throws InterruptedException {
        Home.AddToWishlistButton().get(0).click();
        Thread.sleep(1000);
        Home.AddToWishlistButton().get(1).click();
        Thread.sleep(1000);
        Home.AddToWishlistButton().get(2).click();
        Thread.sleep(4000);
    }


    @Then("Items should be added to the Wishlist")
    public void CheckWishlist()
    {
        String Count = Home.Wishlist().getText();

        //Assertions
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Count.equals("(3)"));

        soft.assertAll();
    }
}
