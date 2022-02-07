package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandalingDisabledWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("ebay.com");



        WebElement adminTab = driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement JobMenu = driver.findElement(By.id("menu_admin_Job"));
        Actions actions = new Actions(driver);
        actions.moveToElement(adminTab).moveToElement(JobMenu).build().perform();
        List<WebElement> job = driver.findElements(By.xpath("//a[@id=\"menu_admin_Job\"]/following-sibling::ul/li"));

        for (WebElement jobname : job) {
            System.out.println(jobname.getText()
            );

        }
    }
}
