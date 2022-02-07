package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class ClassWorkLongCode {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement forSearch = driver.findElement(By.id("gh-ac"));
        forSearch.sendKeys("Dog"+Keys.ENTER);
        WebElement theLink = driver.findElement(By.xpath("//h3[@class='s-item__title']"));
        theLink.click();
        // 2. Create list of web element for each items
        List<WebElement> listOfItems = driver.findElements(By.xpath("//h3[@class='s-item__title']"));

        // Count each item
        int count = 1;

        // 3. Iterate over each item
        for (WebElement element : listOfItems) {

            // 4. Click on each item
            element.click();

            // 5. Each link will open into new tab so switch to new tab / window
            String originalWindow = switchToNewWindow(driver);

            // If we does not find any information from seller we are handling the no such element exception
            try {

                // 6. Find locator for Complete Information
                WebElement ciLink = driver.findElement(By.xpath("//div[@id='bsi-ec']//a[text()='Complete information']"));

                // 7. Check if link exist then click on that
                if (ciLink.isDisplayed()) {
                    ciLink.click();
                }

                // 8. Find locator for email & phone number value
                WebElement phoneValue = driver.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span"));

                System.out.println("==========Seller Information -"+count+"===========");

                // 9. Check if phone number is present then print value of phone number
                if (phoneValue.isDisplayed()) {
                    System.out.println(phoneValue.getText());
                }

                WebElement emailValue = driver.findElement(By.xpath("//span[text()='Email:']/following-sibling::span"));

                // 10. Check if email number is present then print value of email number
                if (emailValue.isDisplayed()) {

                    System.out.println(emailValue.getText());
                }

            }catch (Exception e){
                System.out.println("Some issues with seller - "+count);
            }

            // 11. Close new window
            driver.close();

            // 12. Switch back to original window
            driver.switchTo().window(originalWindow);

            count++;
        }
    }

    public static String switchToNewWindow(WebDriver driver){
        String originalWindow = driver.getWindowHandle();
        Set<String> listOfWindow = driver.getWindowHandles();

        // Switching to new window
        for (String eachWindow   : listOfWindow ) {
            if(!eachWindow.equals(originalWindow)){
                driver.switchTo().window(eachWindow);
            }
        }
        return originalWindow;
    }
    }

