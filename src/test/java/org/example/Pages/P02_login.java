package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement LoginButton()
    {
        By login = By.className("ico-login");
        WebElement loginEle = Hooks.driver.findElement(login);
        return loginEle;
    }

    public WebElement Email()
    {
        By email = By.id("Email");
        WebElement emailEle = Hooks.driver.findElement(email);
        return emailEle;
    }

    public WebElement Password()
    {
        By password = By.id("Password");
        WebElement passwordEle = Hooks.driver.findElement(password);
        return passwordEle;
    }

    public WebElement loginConfirmButton()
    {
        By login = By.id("Password");
        WebElement loginEle = Hooks.driver.findElement(login);
        return loginEle;
    }

    public WebElement MyAccountButton()
    {
        By MyAccount = By.className("ico-account");
        WebElement MyAccountEle = Hooks.driver.findElement(MyAccount);
        return MyAccountEle;
    }

    public WebElement ErrorMsg()
    {
        By ErrMsg = By.className("message-error");
        WebElement ErrMsgEle = Hooks.driver.findElement(ErrMsg);
        return ErrMsgEle;
    }
}
