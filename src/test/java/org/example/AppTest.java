package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class AppTest {

  public static WebDriver driver;

  public static boolean result = false;

  @Test(priority = 1,description = "Hello world")

  public void firstTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 2,description = "Hello world")

  public void secondTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 3,description = "Hello world")

  public void thirdTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 4,description = "Hello world")

  public void fourthTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 5,description = "Hello world")

  public void fifthTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 6,description = "Hello world")

  public void sixthTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 7,description = "Hello world")

  public void seventhTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 8,description = "Hello world")

  public void eighthTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 9,description = "Hello world")

  public void ninthTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }

  @Test(priority = 10,description = "Hello world")

  public void tenthTest() {

    driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Hello world");

    driver.switchTo().activeElement().sendKeys(Keys.ENTER);

    result = driver.findElement(By.xpath("//div[contains(text(),'Результатов:')]")).isDisplayed();

    driver.quit();

  }
}
