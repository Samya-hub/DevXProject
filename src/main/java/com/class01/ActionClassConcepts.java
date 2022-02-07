package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.ldap.Control;
import java.time.Duration;

public class ActionClassConcepts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement linkSignIn = driver.findElement(By.xpath("//span[@id=\"gh-ug\"]/a"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(linkSignIn).keyUp(Keys.CONTROL).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(linkSignIn));

    }
}
