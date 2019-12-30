package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    /*
    * 忽略测试
    * */
    @Test()
    public void ignorTest1(){
        System.out.println("ignorTest 1 执行！");
    }

    @Test(enabled = false)
    public void ignorTest2(){
        System.out.println("ignorTest 2 执行！");
    }

    @Test(enabled = true)
    public void ignorTest3(){
        System.out.println("ignorTest 3 执行！");
    }
}
