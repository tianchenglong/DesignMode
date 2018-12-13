package com.tcl.designmode.creational.abstractfactory;

/**
 *
 * 抽象工厂
 *
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 15:42
 * @version: 1.0
 **/
public interface IAbsFactory {

    public Operation CreateAddOperation();

    public Operation CreateMulOperation();

}
