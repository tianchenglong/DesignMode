package com.tcl.designmode.creational.factorymethod.impl.operationImpl;

import com.tcl.designmode.creational.factorymethod.Operation;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-11 16:05
 * @version: 1.0
 **/
public class OperationMul extends Operation<Double> {
    @Override
    public Double getResult() {
        return numberA * numberB;
    }
}
