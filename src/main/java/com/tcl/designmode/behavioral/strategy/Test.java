package com.tcl.designmode.behavioral.strategy;

/**
 * Author: chenglong.tian@foxmail.com
 * <p>
 * create: 2021-01-09 18:21
 * Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {

        StrategyContext strategyContext = new StrategyContext(new Cat());
        strategyContext.doSomeThing();
    }
}
