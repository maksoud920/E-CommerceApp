package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.example.Pages.P05_categories;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD08_Tages {
    P04_home Home = new P04_home();
    P05_categories Categories = new P05_categories();
    int RandomNum;
    String tagName = null;

    @Given("User click on a random category")
    public void category()
    {
        List<WebElement> categories = Home.Categories();
        int min = 0;
        int max = 6;
        RandomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        categories.get(RandomNum).click();

    }

    @When("User click on a random tag")
    public void ClickOnTag() throws InterruptedException {
        List<WebElement> tagList = Categories.Tags();
        int min = 0;
        int max = 14;
        RandomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        tagName = tagList.get(RandomNum).getText();
        tagList.get(RandomNum).click();
        Thread.sleep(1000);
    }

    @Then("Products with this tag should be displayed")
    public void TagIsDisplayed() throws InterruptedException {
        String text1 = Categories.TagDisplayed().getText();
        String text2 = text1.replaceAll("Products tagged with '", "");
        StringBuffer sb= new StringBuffer(text2);
        String TagName = String.valueOf(sb.deleteCharAt(sb.length()-1));
        Thread.sleep(2000);
        String URL = Hooks.driver.getCurrentUrl();

        //Assertions
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(TagName.equals(tagName));
        soft.assertTrue(URL.contains("https://demo.nopcommerce.com/" + TagName));

        soft.assertAll();


    }
}
