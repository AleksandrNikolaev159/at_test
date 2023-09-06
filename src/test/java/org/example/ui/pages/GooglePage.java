package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

    @FindBy(xpath = "//textarea[@title='Поиск']")
    public static SelenideElement search;

    @FindBy(xpath = "//div[contains(text(),'Результатов:')]")
    public static SelenideElement resultSearch;


}
