package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {

    @Test(dataProvider = "LoginData", dataProviderClass = DataproviderForExample1.class)
    public void loginTest(String email , String password)
    {
            System.out.println(email+ "   " + password);

    }
}
