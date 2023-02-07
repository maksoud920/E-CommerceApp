package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_resetPassword {

    public WebElement Forget()
    {
        By forget = By.cssSelector("a[href=\"/passwordrecovery\"]");
        WebElement forgetEle = Hooks.driver.findElement(forget);
        return forgetEle;
    }

    public WebElement Email()
    {
        By email = By.id("Email");
        WebElement emailEle = Hooks.driver.findElement(email);
        return emailEle;
    }

    public WebElement Msg()
    {
        By msg = By.className("content");
        WebElement msgEle = Hooks.driver.findElement(msg);
        return msgEle;
    }

    public WebElement RecoverButton()
    {
        By recoverBtn = By.cssSelector("button[name=\"send-email\"]");
        WebElement recoverBtnEle = Hooks.driver.findElement(recoverBtn);
        return recoverBtnEle;
    }
}
