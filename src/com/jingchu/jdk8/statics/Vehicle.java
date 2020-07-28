package com.jingchu.jdk8.statics;

/**
 * @description: 车辆默认方法
 * @author: JingChu
 * @createtime :2020-07-28 11:07:28
 **/
public interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }
}