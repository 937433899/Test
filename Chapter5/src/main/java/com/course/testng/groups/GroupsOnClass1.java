package com.course.testng.groups;

import org.testng.annotations.Test;

/*
 * 类分组执行测试
 * */
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass111中的stu1");
    }

    public void stu2(){
        System.out.println("GroupsOnClass111中的stu2");
    }
}
