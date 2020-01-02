package com.course.testng.multThread;

import org.testng.annotations.Test;

/**
 * 多线程
 * */
public class MultThreadOnAnnotion {

    /**
     * 用6个线程ID来执行10个线程
     *invocationCount：表示执行的次数
     * invocationTimeOut：调用的超时
     *threadPoolSize：表示线程池的内线程的个数
     * */
    @Test(invocationCount = 10,threadPoolSize = 6)
    public void test1(){
        System.out.println(1111111111);
        //打印线程ID
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }

}
