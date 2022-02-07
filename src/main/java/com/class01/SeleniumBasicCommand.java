package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumBasicCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/com");
        WebElement searchBox1 = driver.findElement(By.id("gh-cat"));

        Select drop = new Select(searchBox1);

      List<WebElement> mylist = drop.getOptions();
        for (WebElement ss:mylist) {
            System.out.println( ss.getText());

        }driver.close();
    }
}

