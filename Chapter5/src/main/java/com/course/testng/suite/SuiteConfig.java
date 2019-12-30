package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    /**
     * 测试套件
     * */
    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforeSuite运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite运行");
    }

    @BeforeTest
    public void beforTest(){
        System.out.println("BeforeTest运行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest运行");
    }
}
