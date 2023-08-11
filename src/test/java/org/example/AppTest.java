package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class AppTest {

  public static WebDriver driver = new ChromeDriver();

  public static boolean result = false;


  @AfterMethod
  public void pushTestResultMetric(){

    /*
    После каждого теста отправляем метрику в экспортёр pushgateway, представляющую собой набор данных о каждом тесте
     */


  }

  @Test(priority = 1,description = "Hello world")

  public void firstTest() {

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    //driver.quit();

  }

  @Test(priority = 2,description = "Hello world")

  public void secondTest() {

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello ");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

}
