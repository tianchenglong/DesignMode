package com.tcl.designmode.creational.abstractfactory.impl.operationImpl;

import com.tcl.designmode.creational.abstractfactory.Operation;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 16:33
 * @version: 1.0
 **/
public class OperationIntAdd extends Operation<Integer> {
    @Override
    public Integer getResult() {
        return numberA +numberB;
    }
}
