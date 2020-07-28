package com.jingchu.jdk8.statics;

/**
 * @description: 使用 super 来调用指定接口的默认方法：
 * @author: JingChu
 * @createtime :2020-07-28 11:11:16
 **/
public class Car1 implements Vehicle, FourWheeler {
    @Override
    public void print(){
        Vehicle.super.print();
    }
}
