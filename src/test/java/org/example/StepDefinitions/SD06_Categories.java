package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD06_Categories {
    P04_home Home = new P04_home();
    int RandomNum;
    String subCatTitle = null;

    @When("User hover over a random category")
    public void hoverCategories()
    {
        List<WebElement> categories = Home.Categories();
        int min = 0;
        int max = 2;
        RandomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(categories.get(RandomNum)).perform();
        String mainCategory = categories.get(RandomNum).getText();
        System.out.println(mainCategory);
    }

    @And("User select random sub-category")
    public void hoverSubCategory()
    {
        List<WebElement> subCategories = Home.SubCategories(RandomNum);


        int min2 = 0;
        int max2 = 2;
        int subRandomNum = (int)Math.floor(Math.random()*(max2-min2+1)+min2);
        subCatTitle = subCategories.get(subRandomNum).getText();
        System.out.println(subCatTitle);
        subCategories.get(subRandomNum).click();
    }

    @Then("sub-category should be displayed")
    public void successCategory()
    {
        //Assertions
        SoftAssert soft = new SoftAssert();
        String ExpectedResult = subCatTitle;
        String ActualResult = Home.CategoryTitle().getText();
        soft.assertTrue(ActualResult.contains(ExpectedResult));

        soft.assertAll();

    }

}
