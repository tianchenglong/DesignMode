package com.tcl.designmode.creational.abstractfactory.impl.factoryImpl;

import com.tcl.designmode.creational.abstractfactory.IAbsFactory;
import com.tcl.designmode.creational.abstractfactory.Operation;
import com.tcl.designmode.creational.abstractfactory.impl.operationImpl.OperationIntAdd;
import com.tcl.designmode.creational.abstractfactory.impl.operationImpl.OperationIntMul;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 16:37
 * @version: 1.0
 **/
public class IntFactory implements IAbsFactory {
    @Override
    public Operation CreateAddOperation() {
        return new OperationIntAdd();
    }

    @Override
    public Operation CreateMulOperation() {
        return new OperationIntMul();
    }
}
