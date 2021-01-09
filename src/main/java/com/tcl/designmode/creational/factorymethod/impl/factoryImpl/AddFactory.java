package com.tcl.designmode.creational.factorymethod.impl.factoryImpl;

import com.tcl.designmode.creational.factorymethod.IFactory;
import com.tcl.designmode.creational.factorymethod.Operation;
import com.tcl.designmode.creational.factorymethod.impl.operationImpl.OperationAdd;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-11 16:07
 * @version: 1.0
 **/
public class AddFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
