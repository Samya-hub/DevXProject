package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaleElementAA {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        driver.manage().window().maximize();

    }
    @Test
    public void Example(){
        WebElement homeMenu = driver.findElement(By.xpath("//a[text()='Home']"));
        WebElement aboutMenu = driver.findElement(By.xpath("//a[text()='About']"));
        WebElement contactUsMenu = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        WebElement portfolioMenu = driver.findElement(By.xpath("//a[text()='Portfolio']"));
        portfolioMenu.click();
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
homeMenu.click();
    }
}
