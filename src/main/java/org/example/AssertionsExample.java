package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
    WebDriver driver;

    @Test
    void setup (){

        System.setProperty("webdriver.chrome.driver","D:\\intelijj idea\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://online.btes.co.in/login/index.php");
    }

    @Test
    void user (){
        this.driver.findElement(By.id("username")).sendKeys("rch01220063");
    }
    }



