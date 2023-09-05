package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class GooglePageSelenide {

    @FindBy(xpath = "//textarea[@title='Поиск']")
    public static SelenideElement search;

    @FindBy(xpath = "//div[contains(text(),'Результатов:')]")
    public static SelenideElement resultSearch;
}
