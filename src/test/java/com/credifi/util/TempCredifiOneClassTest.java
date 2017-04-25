package com.credifi.util;

import com.credifi.pages.CredifiHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by user on 4/25/2017.
 */
public class TempCredifiOneClassTest {
    public static String textSearch1 = "120 Wall St";
    public static String registered_firstname = "Nikita";

    public WebDriver driver;
    private CredifiHomePage credifyHomepage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
      //  loginCredifiPage = PageFactory.initElements(driver, LoginCredifiPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void OpenLoginPage () {
        driver.get ("https://www.credifi.com/");
    }

    @Test
    public void testCredifiSearch() throws InterruptedException {
        driver.findElement(By.id("autocomplete")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("autocomplete")).sendKeys("120 Wall St");
        Thread.sleep(7000);
        driver.findElement(By.id("ui-id-2")).click();

    }
}
