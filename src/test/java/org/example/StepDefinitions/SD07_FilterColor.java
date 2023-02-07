package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.example.Pages.P05_categories;
import org.example.Pages.P06_Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD07_FilterColor {
    P05_categories filterColor = new P05_categories();
    P06_Item itemColor = new P06_Item();
    P04_home home = new P04_home();

    @Given("User click on shoes subcategory")
    public void chooseCategory() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a")).click();
        Thread.sleep(1000);
        Hooks.driver.findElement(By.xpath("//li[@class=\"inactive\"]/a[@href=\"/shoes\"]")).click();
    }

    @When("User filter color by Red")
    public void chooseColor() throws InterruptedException {
        filterColor.FilterByRed().click();
        Thread.sleep(1000);
    }

    @Then("Red items should be displayed")
    public void CheckFilter() throws InterruptedException {
        home.Item().click();
        Thread.sleep(1000);

        List<WebElement> colors = itemColor.CheckColor();
        String color1 = null;
        String color2 = null;
        String color3 = null;
        SoftAssert soft = new SoftAssert();

        color1 = colors.get(0).getAttribute("title");
        color2 = colors.get(1).getAttribute("title");
        color3 = colors.get(2).getAttribute("title");

        //Assertions
        boolean clr = (color1.equals("Red") || color2.equals("Red") || color3.equals("Red"));

        soft.assertTrue(clr);

        soft.assertAll();

    }

}
