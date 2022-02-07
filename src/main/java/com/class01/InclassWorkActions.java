package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InclassWorkActions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement ee = driver.findElement(By.xpath("//div[@class='hl-cat-nav__expander']/preceding-sibling::a[text()='Electronics']"));


    }
}
