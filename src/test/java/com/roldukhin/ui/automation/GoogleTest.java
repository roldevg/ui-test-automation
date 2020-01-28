package com.roldukhin.ui.automation;


import com.roldukhin.ui.automation.pages.GooglePage;
import com.roldukhin.ui.automation.pages.SearchResultsPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

  @Test(description = "TestCase-1: Simple Search.")
  @Description("User can search simple text")
  public void userCanSearch() {
    open("https://google.com/");

    new GooglePage().searchFor("UI Test Automation projects");
    new SearchResultsPage().getResults().shouldHave(sizeGreaterThan(1));
  }

}
