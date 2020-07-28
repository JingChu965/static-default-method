package com.jingchu.jdk8.defaults;

/**
 * @description: 声明并且可以提供实现静态方法
 * @author: JingChu
 * @createtime :2020-07-28 11:12:17
 **/
public interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }
    // 静态方法
    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}