package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsTestNG {
WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","D:\\intelijj idea\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://online.btes.co.in/login/index.php");
    }

    @Test(priority = 1)
    void logotest(){
      WebElement logo =  driver.findElement(By.xpath("//*[@id=\"yui_3_17_2_1_1682184388995_20\"]/div/div/div/h2"));
 //       Assert.assertTrue((logo.isDisplayed()),"logo not displaayed ");   // if logo is present then true , either false
        Assert.assertFalse(logo.isDisplayed()); // logo should not displayed
    }

    @Test(priority = 2)
    void    TitleHomepage(){
        String title = driver.getTitle();
        Assert.assertEquals("orangeHrs",title,"title is not matched ");
    }

    @AfterTest
    void teatdowm(){
        driver.quit();
    }


}
