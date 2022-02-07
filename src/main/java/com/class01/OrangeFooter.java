package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class OrangeFooter {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String color = driver.findElement(By.xpath("//span[@class=\"form-hint\" and text()='Username']")).getCssValue("Red");
        String firstWindow = driver.getWindowHandle();
        WebElement footer = driver.findElement(By.xpath("//div[@id=\"social-icons\"]/preceding-sibling::div/a"));
        footer.click();
        Set<String> secondWindow = driver.getWindowHandles();
        for (String test : secondWindow) {
            if (!test.equals(firstWindow)) {
                driver.switchTo().window(test);
            }

        }
        driver.findElement(By.xpath("//div[@class=\"header-block\"]/h3[text()='Peace of mind is just a few clicks away!']"));
        System.out.println(driver.getTitle());
        WebElement forin = driver.findElement(By.xpath(""));
        forin.sendKeys("Samya");

    }
}
