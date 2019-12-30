package com.course.testng;

import org.testng.annotations.*;

public class BaseTest {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例方法一");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例方法二");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("在测试方法执行之前执行的方法");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("在测试方法执行之后执行的方法");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("在测试类执行之前执行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("在测试类执行之后执行的方法");

    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");

    }

}
