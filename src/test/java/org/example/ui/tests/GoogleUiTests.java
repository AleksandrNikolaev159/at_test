package org.example.ui.tests;

import com.codeborne.selenide.Condition;
import org.example.ui.pages.GooglePage;
import org.example.ui.dataProviders.GoogleProvider;
import org.example.listeners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.open;
import static org.example.ui.pages.GooglePage.resultSearch;
import static org.example.ui.pages.GooglePage.search;


@Listeners(TestListener.class)
public class GoogleUiTests {

  @Test(priority = 1,description = "Google test",dataProviderClass = GoogleProvider.class, dataProvider = "googleSearch")
  public void selenideTest(String dataString){
    GooglePage page = open("https://www.google.com/", GooglePage.class);
    search.setValue(dataString)
            .pressEnter();
    resultSearch.shouldBe(Condition.visible);

  }

}
