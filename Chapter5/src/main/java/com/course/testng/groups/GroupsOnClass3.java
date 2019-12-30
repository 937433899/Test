package com.course.testng.groups;

import org.testng.annotations.Test;

/*
 * 类分组执行测试
 * */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tea1(){
        System.out.println("GroupsOnClass333中的tea1");
    }

    public void tea2(){
        System.out.println("GroupsOnClass333中的tea2");
    }

    public void tea3(){
        System.out.println("**********************************************************");
    }
}
