package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){

        System.out.println("name = "+name+"; age = "+age);

    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o =new Object[][]{
                {"Li","33"},
                {"zhang","30"},
                {"wang","31"}
        };
        return o;
    }
}
