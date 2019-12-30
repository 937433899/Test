package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
/*
* 方法分组执行测试
* */
public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("server组测试方法test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("server组测试方法test2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("client组测试方法test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("client组测试方法test4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是server组运行之前运行");
    }
    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这是server组运行之后运行");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是client组运行之前运行");
    }
    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这是client组运行之后运行");
    }
}
