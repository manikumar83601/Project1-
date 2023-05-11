package org.example;

import org.testng.annotations.DataProvider;

public class DataproviderForExample1 {


    @DataProvider(name="LoginData")
    public Object[][] getdata()
    {
        Object[][] data= { {"abc@gmail.com","abc123"},{"mani@gmail.com","xyz"},{"dfg@gmail.com","123sdf"}};
        return data;
    }

}
