package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD04_Search {

    P04_home Home = new P04_home();
    String itemName;

    @When("^User search for \"([^\"]*)\"$")
    public void search(String item)
    {
        Home.SearchBox().sendKeys(item);
        itemName = item;

    }

    @And("User click on search button")
    public void searchButtonClick()
    {
        Home.SearchButton().click();
    }

    @Then("Website should show search results")
    public void SuccessSearch()
    {
        //Assertions
        SoftAssert soft = new SoftAssert();

        String ExpectedResult = "https://demo.nopcommerce.com/search?q=";
        String ActualResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(ActualResult.contains(ExpectedResult));

        List<WebElement> Items = Home.SearchItems();
        int count = Items.size();
        System.out.println(count);

        soft.assertTrue(count>1);
        WebElement item;


        for(int i = 0; i < count; i++)
        {
            item = Items.get(i);
            soft.assertTrue(item.getText().toLowerCase().contains(itemName), "Error Message: Search for " + itemName +  " failed");
            System.out.println(item.getText());
        }

        soft.assertAll();
    }
}
