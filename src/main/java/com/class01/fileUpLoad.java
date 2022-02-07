package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fileUpLoad {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        // 1. To open url in browser
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }

    @Test
    public void fileUpload(){
        WebElement fileUploadInput = driver.findElement(By.id("uploadPicture"));
        fileUploadInput.sendKeys("C:\\Users\\Punku\\Desktop");

        WebElement fileUploadBtn = driver.findElement(By.id("submit"));
        fileUploadBtn.click();
    }










}
