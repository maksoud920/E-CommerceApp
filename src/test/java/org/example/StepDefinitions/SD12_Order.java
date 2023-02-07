package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_home;
import org.example.Pages.P08_ShoppingCart;
import org.example.Pages.P09_Checkout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD12_Order {
    P04_home Home = new P04_home();
    P08_ShoppingCart Cart = new P08_ShoppingCart();
    P09_Checkout Checkout = new P09_Checkout();

    @When("User press on Add To Cart button on an item")
    public void AddToCart() throws InterruptedException {
        Home.ItemToOrder().click();
        Thread.sleep(4000);
    }


    @And("User Open Shopping Cart")
    public void OpenCart() throws InterruptedException {
        Home.ShoppingCart().click();
        Thread.sleep(1000);
    }

    @And("User click on agree to terms checkbox")
    public void AgreeTerms()
    {
        Cart.Terms().click();
    }

    @And("User click on Checkout button")
    public void PressCheckout()
    {
        Cart.CheckoutButton().click();
    }

    @And("User add billing address details and press Continue button")
    public void AddAddressDetails() throws InterruptedException {
        Select selectCountry = new Select(Hooks.driver.findElement(By.id("BillingNewAddress_CountryId")));
        selectCountry.selectByVisibleText("Egypt");
        Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Assiut");
        Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Assiut");
        Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("71111");
        Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01012345678");


        Checkout.AddressContinueButton().click();
        Thread.sleep(1000);
    }

    @And("User select shipping method and press Continue button")
    public void SelectShipping() throws InterruptedException {
        Checkout.ShippingContinueButton().click();
        Thread.sleep(1000);
    }

    @And("User select Payment method and press Continue button")
    public void SelectPayment() throws InterruptedException {
        Checkout.PaymentContinueButton().click();
        Thread.sleep(1000);
    }

    @And("User press on Continue button in Payment information tab")
    public void ContinuePaymentInfo() throws InterruptedException {
        Checkout.PaymentInfoContinueButton().click();
        Thread.sleep(1000);
    }

    @And("User press on Confirm button")
    public void PressConfirmButton() throws InterruptedException {
        Checkout.ConfirmButton().click();
        Thread.sleep(1000);
    }

    @Then("Order should be created successfully")
    public void SuccessOrder()
    {
        String URL = Hooks.driver.getCurrentUrl();

        //Assertions
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(URL.contains("https://demo.nopcommerce.com/checkout/completed"));
        String Msg = Hooks.driver.findElement(By.xpath("//div[@class=\"section order-completed\"]/div[@class=\"title\"]")).getText();
        soft.assertTrue(Msg.contains("Your order has been successfully processed!"));
        System.out.println(Msg);
        soft.assertAll();
    }
}
