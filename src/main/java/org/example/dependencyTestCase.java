package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyTestCase {

    @Test
    void startcar ()
    {
        System.out.println("car started ");
    }

    @Test(dependsOnMethods = "startcar")
    void driver(){
        System.out.println("driing ");
        Assert.fail();
    }

    @Test(dependsOnMethods = "driver")
    void stopcar(){
        System.out.println(" break ");
    }


    @Test(dependsOnMethods = {"stopcar" , "startcar"})
    void park()
    {
        System.out.println("parking ");
    }






}
