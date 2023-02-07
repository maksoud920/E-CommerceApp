package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerButton()
    {
        By register = By.className("ico-register");
        return Hooks.driver.findElement(register);
    }

    public WebElement FirstName()
    {
        By firstName = By.id("FirstName");
        WebElement firstNameEle = Hooks.driver.findElement(firstName);
        return firstNameEle;
    }

    public WebElement LastName()
    {
        By lastName = By.id("LastName");
        WebElement lastNameEle = Hooks.driver.findElement(lastName);
        return lastNameEle;
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

    public WebElement ConfirmPassword()
    {
        By confirmPassword = By.id("ConfirmPassword");
        WebElement ConfirmPasswordEle = Hooks.driver.findElement(confirmPassword);
        return ConfirmPasswordEle;
    }

    public WebElement registerConfirmButton()
    {
        By register = By.id("register-button");
        return Hooks.driver.findElement(register);
    }

    public WebElement registerMsg()
    {
        By msg = By.className("result");
        return Hooks.driver.findElement(msg);
    }
}
