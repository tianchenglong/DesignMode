package com.tcl.designmode.behavioral.strategy;

/**
 * Author: chenglong.tian@foxmail.com
 * <p>
 * create: 2021-01-09 18:18
 * Version: 1.0
 **/
public class Cat implements AbstractStrategy {

    @Override
    public void doSomeThing() {
        System.out.println("喵喵。。。。");
    }
}
