package com.tcl.designmode.creational.factorymethod;

/**
 *
 * 操作抽象类
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-11 15:54
 * @version: 1.0
 **/
public abstract class Operation<T> {
    protected T numberA ;
    protected T numberB ;

    public abstract  T getResult();
}
