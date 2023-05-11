package org.example;

import org.testng.annotations.*;

public class TestNG3 {


    @BeforeTest
    void beforetest(){
        System.out.println("this is before test");
    }
    @AfterTest
    void aftertest(){
        System.out.println("this is after test");
    }




    @BeforeClass
    void beforeclass (){
        System.out.println("execute before class");
    }

    @AfterClass
    void afterclass(){
        System.out.println("execute after class ");
    }

    @BeforeMethod
    void beforemethod(){
        System.out.println("execiute before every method");
    }

    @AfterMethod
    void aftermethod(){
        System.out.println("execute after every method");
    }

    @Test
    void test1(){
        System.out.println("this is test 1 ");
    }

    @Test
    void test2(){
        System.out.println("this is test 2 ");
    }




}
