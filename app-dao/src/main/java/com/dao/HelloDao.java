package com.dao;

/**
 * Created by Administrator on 2018/7/1 0001.
 */
public class HelloDao {
    public String sayHello(String name){
        return "name:"+name;
    }
    public void m1(){
        System.out.println("git append m1()");
    }
    public void m2(){
        System.out.println("为了版本回退而增加的m2()方法");
    }
    public void m3(){
        System.out.println("dev2");
        System.out.println("dev1");

    }

}
