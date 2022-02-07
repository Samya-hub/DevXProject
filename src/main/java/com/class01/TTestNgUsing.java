package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TTestNgUsing {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }
    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
@Test
    public void enrollmentForm(){
    driver.get("https://www.expedia.com/?pwaLob=");

    WebElement mark = driver.findElement(By.xpath("//span[text()='Cars']"));
  mark.click();

  WebElement drops = driver.findElement(By.xpath("//select[@aria-label=\"Pick-up time\"]"));

  Select select = new Select(drops);
  select.selectByValue("10.30 am");
  Assert.assertTrue(select.getFirstSelectedOption().getText().equals("10.30 am"));
  Actions action = new Actions(driver);


    }
}

