package com.credifi;

import com.credifi.pages.CredifiHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by user on 4/25/2017.
 */

public class CredifiSearchTest extends TestNgTestBase {

  public static String textSearch1 = "120 Wall St";
  public static String textSearch2 = "4000 Hollywood Blvd";
  public static String textSearch3 = "5150 E Pacific Coast Hwy";

  private CredifiHomePage credifyHomepage;


  @BeforeClass(alwaysRun = true)
  public void setup() {
    driver = new ChromeDriver();
    //  driver = new FirefoxDriver();
    credifyHomepage = PageFactory.initElements(driver, CredifiHomePage.class);
  }

  @BeforeMethod(alwaysRun = true)
  public void beforeMethodSetUp() {
    credifyHomepage.OpenPage(); }

  @Test
  public void testCredifiSearch() {
    credifyHomepage.CredifiSearchAndGetData(textSearch1);
    credifyHomepage.CredifiSearchAndGetData(textSearch2);
    credifyHomepage.CredifiSearchAndGetData(textSearch3);

  }
}
