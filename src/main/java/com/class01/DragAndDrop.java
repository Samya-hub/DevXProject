package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        WebElement ifframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        WebElement toBox = driver.findElement(By.id("trash"));
        WebElement fromImg = driver.findElement(By.xpath("//ul[@id='gallery']/li/h5[text()='High Tatras']"));
        driver.switchTo().frame(ifframe);
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.dragAndDrop(fromImg,toBox).build().perform();
    }
}
