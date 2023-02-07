package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_Item {

    public List<WebElement> CheckColor()
    {
        By color = By.xpath("//span[@class=\"attribute-square-container\"]");
        List<WebElement> colorEle = Hooks.driver.findElements(color);
        return colorEle;
    }
}
