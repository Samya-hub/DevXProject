package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement loginU = driver.findElement(By.id("user-name"));
        loginU.sendKeys("standard_user");
        WebElement loginP = driver.findElement(By.id("password"));
        loginP.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(5000);
        WebElement filter = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
        filter.click();
        Select ss = new Select(filter);
        ss.selectByIndex(5);


    }
}
