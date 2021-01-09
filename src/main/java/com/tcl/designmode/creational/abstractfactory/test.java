package com.tcl.designmode.creational.abstractfactory;

import com.tcl.designmode.creational.abstractfactory.impl.factoryImpl.FloatFactory;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 16:46
 * @version: 1.0
 **/
public class test {
    public static void main(String[] args){
        /**
         * 直接抽象工厂
         */
        notReflect();

        /**
         * 反射加抽象工厂
         */
        reflect();
    }

    private static void notReflect() {
        IAbsFactory iAbsFactory = new FloatFactory();
        Operation operation = iAbsFactory.CreateMulOperation();
        operation.numberA = 9f;
        operation.numberB = 8f;
        System.out.println(operation.getResult());
        operation = iAbsFactory.CreateMulOperation();
        operation.numberA = 9f;
        operation.numberB = 8f;
        System.out.println(operation.getResult());
    }

    private static void reflect() {
        OperationAccess operationAccess = new OperationAccess("Float");
        Operation operation= operationAccess.CreateAddOperation();
        operation.numberA = 9f;
        operation.numberB = 8f;
        System.out.println(operation.getResult());
        operation = operationAccess.CreateMulOperation();
        operation.numberA = 9f;
        operation.numberB = 8f;
        System.out.println(operation.getResult());
    }
}
