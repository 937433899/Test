package com.course.testng.multThread;

import org.testng.annotations.Test;

public class MultThreadOnXml {

    @Test
    public void test1(){
        //打印线程ID
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void Test3(){
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }


}
