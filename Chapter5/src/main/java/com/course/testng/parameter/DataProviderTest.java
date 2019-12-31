package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    /**
     * 参数化传递
     * */
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){

        System.out.println("name = "+name+"; age = "+age);

    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o =new Object[][]{
                {"Li",33},
                {"zhang",30},
                {"wang",31}
        };
        return o;
    }
    /**
     * 通过方法名控制传递的参数不同
     * */
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法执行 name="+name+";age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test222方法执行 name="+name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] o =null;
        if (method.getName().equals("test1")){
            o=new Object[][]{
                    {"zhang",29},
                    {"wang",30}
            };
        }else if(method.getName().equals("test2")){
            o=new Object[][]{
                    {"li",33},
                    {"P",63}
            };
        }
        return o;
    }
}
