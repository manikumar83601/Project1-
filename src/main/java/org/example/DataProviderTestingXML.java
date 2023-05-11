package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class DataProviderTestingXML {

    WebDriver driver;

    //driver setup
    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver","D:\\intelijj idea\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         // wait between pages

        driver.manage().window().maximize();        //maximize

    }

//-------------------------------

    @Test(dataProvider = "LoginData")
    public void loginTest (String username, String password , String expectedresult) {
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

        WebElement txtmail = driver.findElement(By.id("Email"));
        txtmail.clear();
        txtmail.sendKeys(username);

        WebElement txtpassword = driver.findElement(By.id("Password"));
        txtpassword.clear();
        txtpassword.sendKeys(password);

        WebElement checkbox = driver.findElement(By.id("RememberMe"));
        checkbox.click();

        WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
        loginbutton.click();

       String expectedTitle = "Dashboard / nopCommerce administration";
       String actualTitle = driver.getTitle();



         //conditions of Valid input
        if (expectedresult.equals("valid"))     //checking input data is valid or not from data provided
        {
            if (expectedTitle.equals(actualTitle))       //checking titles are matching or not
            {
                driver.findElement(By.linkText("Logout")).click();          //if logged in then loggin out
                Assert.assertTrue(true);                //passing that test data is passes
            } else {
                Assert.assertTrue(false);               //passing test case is failed
            }
        }

     /*   //conditions for invalid input
             if(expectedresult.equals("invalid")){
                if (expectedTitle.equals(actualTitle)){
                    driver.findElement(By.linkText("Logout")).click();          //if logged in then loggin out
                    Assert.assertTrue(false);
                }
                else {
                    Assert.assertTrue(true);
                }
        }*/
    }

//------------------------------------

    @DataProvider(name = "LoginData")
    //public String [][] ---> when we have only String data
    public Object[][] getData()
    {

        String logindata [][]  = {

                {"admin@yourstore.com","admin","valid"},
               {"admin123@gmail.com","1234asd", "invalid"},

                {"123asd@gmail.com","123asd@gmail.com","invalid"},

        };
        return logindata;
    }

//-----------------------


    @AfterClass
    public void aferclass()
    {
        driver.close();
    }


}
