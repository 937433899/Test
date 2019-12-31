package com.course.testng;


import org.testng.annotations.Test;

/**
 * 依赖测试
 * 被依赖的方法执行失败，依赖的方法不执行
 * */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 执行");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 执行");
    }
}
