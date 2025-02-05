package org.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//TODO: go to allo.ua
//TODO: search for ANY PHONE
//TODO: print phone name for 1st phone in search
//TODO: For example: Apple iPhone 16 Pro Max 256GB Desert Titanium (MYWX3)
public class SeleniumHomeWork {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://allo.ua/");

            Thread.sleep(2000);
            System.out.println(driver.getTitle());
            WebElement searchInput = driver.findElement(By.id("search-form__input"));
            searchInput.sendKeys(String.valueOf("Xiaomi"));
            searchInput.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            System.out.println(driver.getTitle());


            WebElement questionElement = driver.findElement(By.xpath("//a[contains(@title,'Xiaomi')]"));
            questionElement.getText();
            System.out.println(questionElement.getText());




        }
        finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
