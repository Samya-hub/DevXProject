package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAlerrt {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement threeA = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        threeA.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());


        }
    }

