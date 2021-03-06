package com.tcl.designmode.creational.abstractfactory.impl.operationImpl;

import com.tcl.designmode.creational.abstractfactory.Operation;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 16:35
 * @version: 1.0
 **/
public class OperationFloatAdd extends Operation<Float> {
    @Override
    public Float getResult() {
        return numberA + numberB;
    }
}
