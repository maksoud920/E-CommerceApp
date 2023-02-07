package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.example.Pages.P07_Compare;
import org.testng.asserts.SoftAssert;

public class SD11_Compare {

    P04_home Home = new P04_home();
    P07_Compare Compare = new P07_Compare();

    @When("User press on add to compare list button on three different books")
    public void AddToComparelist() throws InterruptedException {
        Home.AddToCompareListButton().get(0).click();
        Thread.sleep(1000);
        Home.AddToCompareListButton().get(1).click();
        Thread.sleep(1000);
        Home.AddToCompareListButton().get(2).click();
        Thread.sleep(4000);
    }


    @Then("Items should be added to compare list")
    public void CheckComparelist() throws InterruptedException {
        Home.CompareList().click();
        Thread.sleep(2000);
        int Count = Compare.ComparedItems().size() - 1;

        //Assertions
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Count == 3);

        soft.assertAll();
    }
}
