package com.credifi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Sample page
 */
public class CredifiHomePage extends Page {

  @FindBy(id = "autocomplete")
  WebElement searchBox;
  @FindBy(id = "ui-id-2")
  WebElement firstSearchAddress;
  @FindBy(id = "srch-term")
  WebElement FirstSearchingPage;

  @FindBy(xpath = "//*div[@class='row']//[@class='size30px ng-binding']")
  WebElement WebElementPropertyName;
  @FindBy(xpath = "//*div[@class='ng-scope']//[@class='size29px ng-binding']")
  WebElement WebElementPropertyAddress;
  @FindBy(xpath = "//*div[@class='size29px ng-scope']//[@class='ng-binding ng-scope']")
  WebElement WebElementCityState;

  public CredifiHomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public void OpenPage () {
    driver.get ("https://www.credifi.com/");
  }


  public void FillSearchBox(String searchText) {
    setElementText(searchBox, searchText);
  }
  public void WaitUntilPageIsLoaded() {
    waitUntilIsLoadedCustomTime(searchBox, 7);
  }
  public void ClickFirstSearch() {
    clickElement(firstSearchAddress);
  }
  public void WaitUntilSearchIsLoaded() {
    waitUntilIsLoadedCustomTime(firstSearchAddress,7);
  }
  public void WaitSearchinPageIsLoaded() {
    waitUntilIsLoadedCustomTime(FirstSearchingPage,7);
  }

  public String ReturnTextPropertyName (){
    String tableText = WebElementPropertyName.getText();
    return tableText;
  }
  public String ReturnTextPropertyAddress (){
    String tableText = WebElementPropertyAddress.getText();
    return tableText;
  }
  public String ReturnTextCityState (){
    String tableText = WebElementCityState.getText();
    return tableText;
  }

  public void CredifiSearchAndGetData(String searchText) {
    WaitUntilPageIsLoaded();
    FillSearchBox(searchText);
    WaitUntilSearchIsLoaded();
    ClickFirstSearch();
    WaitSearchinPageIsLoaded();
    System.out.println(ReturnTextPropertyName());
    System.out.println(ReturnTextPropertyAddress());
    System.out.println(ReturnTextCityState());

  }


}

