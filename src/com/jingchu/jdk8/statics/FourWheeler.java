package com.jingchu.jdk8.statics;

/**
 * @description: 四轮车默认方法
 * @author: JingChu
 * @createtime :2020-07-28 11:07:53
 **/
public interface FourWheeler {
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}
