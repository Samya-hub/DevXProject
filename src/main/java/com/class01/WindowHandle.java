package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement linkToClick = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
        linkToClick.click();

        String firstWindow = driver.getWindowHandle();
        Set<String> totWindow = driver.getWindowHandles();

        for (String my : totWindow) {
            if (!my.equals(firstWindow)) {
                driver.switchTo().window(my);
            }


        }
        WebElement texxt = driver.findElement(By.id("myText"));
        texxt.sendKeys("test@gmail.com");
    }
}

