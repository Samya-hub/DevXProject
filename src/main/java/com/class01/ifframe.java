package com.class01;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");
        WebElement frameBox = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameBox);
        WebElement text = driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p"));
        text.sendKeys("Samya");
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.close();
    }
}
