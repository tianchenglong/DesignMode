package com.tcl.designmode.creational.abstractfactory.impl.factoryImpl;

import com.tcl.designmode.creational.abstractfactory.IAbsFactory;
import com.tcl.designmode.creational.abstractfactory.Operation;
import com.tcl.designmode.creational.abstractfactory.impl.operationImpl.OperationFloatAdd;
import com.tcl.designmode.creational.abstractfactory.impl.operationImpl.OperationFloatMul;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 16:44
 * @version: 1.0
 **/
public class FloatFactory implements IAbsFactory {
    @Override
    public Operation CreateAddOperation() {
        return new OperationFloatAdd();
    }

    @Override
    public Operation CreateMulOperation() {
        return new OperationFloatMul();
    }
}
