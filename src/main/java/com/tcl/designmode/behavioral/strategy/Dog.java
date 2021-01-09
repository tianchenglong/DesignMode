package com.tcl.designmode.behavioral.strategy;

/**
 * Author: chenglong.tian@foxmail.com
 * <p>
 * create: 2021-01-09 18:16
 * Version: 1.0
 **/
public class Dog implements AbstractStrategy {
    @Override
    public void doSomeThing() {
        System.out.println("旺 旺。。。。。");
    }
}
