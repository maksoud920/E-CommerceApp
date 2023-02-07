package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_Checkout {

    public WebElement AddressContinueButton()
    {
        By continueButton = By.xpath("//div[@id=\"billing-buttons-container\"]/button[@class=\"button-1 new-address-next-step-button\"]");
        WebElement continueButtonEle= Hooks.driver.findElement(continueButton);
        return continueButtonEle;
    }

    public WebElement ShippingContinueButton()
    {
        By continueButton = By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
        WebElement continueButtonEle= Hooks.driver.findElement(continueButton);
        return continueButtonEle;
    }

    public WebElement PaymentContinueButton()
    {
        By continueButton = By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
        WebElement continueButtonEle= Hooks.driver.findElement(continueButton);
        return continueButtonEle;
    }

    public WebElement PaymentInfoContinueButton()
    {
        By continueButton = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
        WebElement continueButtonEle= Hooks.driver.findElement(continueButton);
        return continueButtonEle;
    }


    public WebElement ConfirmButton()
    {
        By confirmButton = By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");
        WebElement confirmButtonEle= Hooks.driver.findElement(confirmButton);
        return confirmButtonEle;
    }


}
