package com.jingchu.jdk8.statics;

/**
 * @description: 创建自己的默认方法，来覆盖重写接口的默认方法：
 * @author: JingChu
 * @createtime :2020-07-28 11:08:56
 **/
public class Car implements Vehicle, FourWheeler {
    @Override
    public void print(){
        System.out.println("我是一辆四轮汽车!");
    }
}