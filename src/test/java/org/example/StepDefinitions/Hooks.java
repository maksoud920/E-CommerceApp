package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void Open_Browser() throws InterruptedException {
        // 1- bridge between test scripts and browsers
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);

        // 2-New Object of WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 3- Navigate to the website and maximize screen and sleep 3 seconds
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
    }

    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
