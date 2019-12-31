package com.course.testng;

import org.testng.annotations.Test;

/**
 * 异常测试
 * 期望结果为某个异常时用到异常测试，如：传入不合法的参数，程序抛出异常
 * */
public class ExceptedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcptionFailed(){
        System.out.println("这是一个测试结果失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
