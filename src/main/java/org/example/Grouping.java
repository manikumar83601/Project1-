package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {

    @Test
    void g1 ()
    {
        System.out.println("g1 ");
    }

    @Test(groups = {"sanity"})
    void g2(){
        System.out.println("g2 ");
        Assert.fail();
    }

    @Test(groups = {"regression"})
    void g3(){
        System.out.println(" g3 ");
    }


    @Test(groups = {"smokw"})
    void g4()
    {
        System.out.println("g4 ");
    }

}
