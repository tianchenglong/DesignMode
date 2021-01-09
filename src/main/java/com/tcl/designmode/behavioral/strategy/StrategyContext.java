package com.tcl.designmode.behavioral.strategy;

/**
 * 策略模式上下文
 *
 * Author: chenglong.tian@foxmail.com
 * <p>
 * create: 2021-01-09 18:10
 * Version: 1.0
 **/
public class StrategyContext {

    private  AbstractStrategy abstractStrategy;

    public StrategyContext(AbstractStrategy strategy){
        this.abstractStrategy = strategy;
    }

    public void doSomeThing(){
        abstractStrategy.doSomeThing();
    }

}
