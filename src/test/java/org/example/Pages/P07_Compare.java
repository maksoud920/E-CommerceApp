package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_Compare {

    public List<WebElement> ComparedItems()
    {
        By comparedItems = By.xpath("//tr[@class=\"product-name\"]/td");
        List<WebElement> comparedItemsEle = Hooks.driver.findElements(comparedItems);
        return comparedItemsEle;
    }
}
