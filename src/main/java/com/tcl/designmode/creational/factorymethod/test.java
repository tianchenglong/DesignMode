package com.tcl.designmode.creational.factorymethod;


import com.tcl.designmode.creational.factorymethod.impl.factoryImpl.MulFactory;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-11 16:09
 * @version: 1.0
 **/
public class test {
    public static void main(String[] args){
        IFactory operFactory   = new MulFactory();
        Operation oper  = operFactory.CreateOperation();
        oper.numberA = 2l;
        oper.numberB = 5l;
        System.out.println(oper.getResult());
    }
}
