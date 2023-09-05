package org.example;

import com.codeborne.selenide.Condition;
import org.example.metrics.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.open;
import static org.example.GooglePageSelenide.resultSearch;
import static org.example.GooglePageSelenide.search;


@Listeners(TestListener.class)
public class UiTest {

  @Test(priority = 1,description = "Google test",dataProviderClass = GoogleTestData.class, dataProvider = "googleSearch")
  public void selenideTest(String dataString){
    GooglePageSelenide page = open("https://www.google.com/", GooglePageSelenide.class);
    search.setValue(dataString)
            .pressEnter();
    resultSearch.shouldBe(Condition.visible);

  }
}
