package org.prog.testng;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//TODO: create separate test-ng.xml file with this class only
//TODO: move your selenium test to this class
//TODO: Add assertion that goods name is not null
//TODO: Add assertion that goods name has > 0 length

public class AlloUaNGTest {

//    @BeforeClass
//    public void beforeAllo() {
//        System.out.println(">>>>>>>>>>ALLO.START");
//    }
//
//    @AfterClass
//    public void afterAllo() {
//        System.out.println(">>>>>>>>>>ALLO.END");
//    }
//
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("Test!<<<<<<<<<<<<<<<<<<<<");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("Test!<<<<<<<<<<<<<<<<<<<<");
//    }

    @Test
    public void ngTest1() {
        System.out.println("Hello Allo UA Test! 5");
    }

    @Test
    public void ngTest2() {
        System.out.println("Hello Allo UA Test 1!");
    }

    @Test
    public void ngTest3() {
        System.out.println("Hello Allo UA Test 2!");
    }

    @Test
    public void ngTest4() {
        System.out.println("Hello Allo UA Test 3!");
    }

    @Test
    public void ngTest5() {
        System.out.println("Hello Allo UA Test! 4");
    }

    @Test
    public void ngTest6() {


        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://allo.ua/");

            //Thread.sleep(2000);
            System.out.println(driver.getTitle());
            WebElement searchInput = driver.findElement(By.id("search-form__input"));
            searchInput.sendKeys(String.valueOf("Xiaomi"));
            searchInput.sendKeys(Keys.ENTER);
            //Thread.sleep(2000);
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
