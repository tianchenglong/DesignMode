package com.tcl.designmode.creational.abstractfactory;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 15:53
 * @version: 1.0
 **/
public abstract   class  Operation<T> {
    protected T numberA;
    protected T numberB;

    public abstract T getResult();
}
