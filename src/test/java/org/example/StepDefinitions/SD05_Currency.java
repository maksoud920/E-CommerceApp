package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD05_Currency {
    P04_home Home = new P04_home();

    @When("User change currency from the drop down list")
    public void ChooseCurrency()
    {
        Select dropdown = new Select(Home.SelectCurrency());
        dropdown.selectByVisibleText("Euro");
    }

    @Then("Currencies should be displayed in the selected currency")
    public void CheckCurrency()
    {
        List<WebElement> Items = Hooks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        int count = Items.size();
        WebElement item;

        //Assertions
        SoftAssert soft = new SoftAssert();

        for(int i = 0; i < count; i++)
        {
            item = Items.get(i);
            soft.assertTrue(item.getText().contains("€"));
            System.out.println(item.getText());

        }

        soft.assertAll();
    }
}
