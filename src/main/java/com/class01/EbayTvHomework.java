package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class EbayTvHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement element = driver.findElement(By.id("gh-ac"));
        element.sendKeys("Tv" + Keys.ENTER);
        WebElement forTvLink = driver.findElement(By.xpath("//h3[text()='Samsung 55\" AU8000  4K Crystal UHD HDR Smart TV - 3 HDMI (2021)']"));
        forTvLink.click();
        String firWindow = driver.getWindowHandle();
        Set<String> allWin = driver.getWindowHandles();
        for (String ss : allWin) {
            if (!ss.equals(firWindow)) {
                driver.switchTo().window(ss);
            }
            WebElement myText = driver.findElement(By.xpath("//span[@class=\"ux-textspans--PSEUDOLINK ux-textspans--BOLD\"]"));
            myText.getText();
        }

    }
}
