package com.tcl.designmode.creational.builder;

/**
 *
 * 指挥类
 *
 * 把创建一个person 对象的步骤统一管理，防止漏掉，导致对象不完整
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-05 23:19
 * @version: 1.0
 **/
public class Director {

    /**
     *  把person所需的每个创建方法都统一放在一下，防止遗漏
     * @param builder
     */
    public void CreatePerson(Builder builder){
        builder.setAge();
        builder.setHeight();
        builder.setName();
        builder.setWeigth();
    }
}
