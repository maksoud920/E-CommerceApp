package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_ShoppingCart {

    public WebElement Terms()
    {
        By terms = By.id("termsofservice");
        WebElement termsEle= Hooks.driver.findElement(terms);
        return termsEle;
    }

    public WebElement CheckoutButton()
    {
        By checkoutButton = By.id("checkout");
        WebElement checkoutButtonEle= Hooks.driver.findElement(checkoutButton);
        return checkoutButtonEle;
    }
}
