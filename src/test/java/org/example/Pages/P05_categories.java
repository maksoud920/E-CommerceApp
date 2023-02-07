package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_categories {

    public WebElement FilterByRed()
    {
        By filterByRed = By.cssSelector("label[for=\"attribute-option-15\"]");
        WebElement filterByRedEle = Hooks.driver.findElement(filterByRed);
        return filterByRedEle;
    }

    public List<WebElement> Tags()
    {
        By tags = By.xpath("//div[@class=\"tags\"]/ul/li");
        List<WebElement> tagsEle = Hooks.driver.findElements(tags);
        return tagsEle;
    }

    public WebElement TagDisplayed()
    {
        By tagDisplayed = By.xpath("//div[@class=\"page-title\"]");
        WebElement tagDisplayedEle = Hooks.driver.findElement(tagDisplayed);
        return tagDisplayedEle;
    }

}
