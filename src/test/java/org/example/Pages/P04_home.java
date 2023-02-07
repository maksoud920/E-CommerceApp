package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_home {


    //Search Feature
    public WebElement SearchBox()
    {
        By searchBox = By.id("small-searchterms");
        WebElement searchBoxEle = Hooks.driver.findElement(searchBox);
        return searchBoxEle;
    }

    public WebElement SearchButton()
    {
        By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement searchButtonEle = Hooks.driver.findElement(searchButton);
        return searchButtonEle;
    }

    public List SearchItems()
    {
        List<WebElement> Items = Hooks.driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
        return Items;
    }
/////////////////////////////////////////////

    //Currency Feature
    public WebElement SelectCurrency()
    {
        By selectCurrency = By.id("customerCurrency");
        WebElement selectCurrencyEle = Hooks.driver.findElement(selectCurrency);
        return selectCurrencyEle;
    }
////////////////////////////////////////////

    //Categories Feature
    public List<WebElement> Categories()
    {
        By categories = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a");
        List<WebElement> categoriesEle= Hooks.driver.findElements(categories);
        return categoriesEle;

    }

    public List<WebElement> SubCategories(int RandomNum)
    {
        By subCategories = By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+(RandomNum+1)+"]/ul[@class=\"sublist first-level\"]/li");
        List<WebElement> subCategoriesEle= Hooks.driver.findElements(subCategories);
        return subCategoriesEle;


    }

    public WebElement CategoryTitle()
    {
        By categoryTitle = By.className("page-title");
        WebElement categoryTitleEle= Hooks.driver.findElement(categoryTitle);
        return categoryTitleEle;


    }

    public WebElement Item()
    {
        By Item = By.xpath("//h2[@class=\"product-title\"]");
        WebElement ItemEle= Hooks.driver.findElement(Item);
        return ItemEle;
    }

    public WebElement Books()
    {
        By Book = By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/books\"]");
        WebElement BookEle= Hooks.driver.findElement(Book);
        return BookEle;
    }


    //Add to cart Feature
    public List<WebElement> AddToCartButton()
    {
        By AddButton = By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]");
        List<WebElement> AddButtonEle = Hooks.driver.findElements(AddButton);
        return AddButtonEle;
    }

    public WebElement CartCount()
    {
        By cart = By.className("cart-qty");
        WebElement cartEle= Hooks.driver.findElement(cart);
        return cartEle;
    }


    //Add to Wishlist Feature
    public List<WebElement> AddToWishlistButton()
    {
        By AddButton = By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]");
        List<WebElement> AddButtonEle = Hooks.driver.findElements(AddButton);
        return AddButtonEle;
    }

    public WebElement Wishlist()
    {
        By wishlist = By.className("wishlist-qty");
        WebElement wishlistEle= Hooks.driver.findElement(wishlist);
        return wishlistEle;
    }


    public List<WebElement> AddToCompareListButton()
    {
        By AddButton = By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]");
        List<WebElement> AddButtonEle = Hooks.driver.findElements(AddButton);
        return AddButtonEle;
    }

    public WebElement CompareList()
    {
        By compareList = By.xpath("//a[@href=\"/compareproducts\"]");
        WebElement compareListEle= Hooks.driver.findElement(compareList);
        return compareListEle;
    }


    //Order Feature
    public WebElement ItemToOrder()
    {
        By AddButton = By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]");
        List<WebElement> AddButtonEle = Hooks.driver.findElements(AddButton);
        WebElement AddItemToCart = AddButtonEle.get(2);
        return AddItemToCart;
    }

    public WebElement ShoppingCart()
    {
        By shoppingCart = By.xpath("//li[@id=\"topcartlink\"]/a[@href=\"/cart\"]");
        WebElement shoppingCartEle= Hooks.driver.findElement(shoppingCart);
        return shoppingCartEle;
    }






}
