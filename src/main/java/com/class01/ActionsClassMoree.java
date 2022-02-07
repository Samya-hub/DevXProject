package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMoree {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement usernamess = driver.findElement(By.id("txtUsername"));
        usernamess.sendKeys("Admin");
        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys("admin123");
        WebElement forclic = driver.findElement(By.id("btnLogin"));
        forclic.click();

        WebElement forAd = driver.findElement(By.xpath("//b[text()='Admin']"));
        WebElement forJob = driver.findElement(By.id("menu_admin_Job"));
        WebElement forJTitle = driver.findElement(By.xpath("//a[text()='Job Titles']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(forAd).moveToElement(forJob).moveToElement(forJTitle).click().build().perform();
    }
}
