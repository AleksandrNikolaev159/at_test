package ui.tests;

import com.codeborne.selenide.Condition;
import listeners.TestListener;
import ui.pages.GooglePage;
import ui.dataProviders.GoogleProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.open;


@Listeners(TestListener.class)
public class GoogleUiTests {

  @Test(priority = 1,description = "Google test",dataProviderClass = GoogleProvider.class, dataProvider = "googleSearch")
  public void superTest (String dataString){
    GooglePage page = open("https://www.google.com/", GooglePage.class);
    GooglePage.search.setValue(dataString)
            .pressEnter();
    GooglePage.resultSearch.shouldBe(Condition.visible);

  }

  @Test(priority = 2,description = "Google test",dataProviderClass = GoogleProvider.class, dataProvider = "googleSearch")
  public void test (String dataString){
    GooglePage page = open("https://www.google.com/", GooglePage.class);
    GooglePage.search.setValue(dataString)
            .pressEnter();
    GooglePage.resultSearch.shouldBe(Condition.visible);

  }

}
