package com.tcl.designmode.creational.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 通过反射+抽象工厂
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-13 17:30
 * @version: 1.0
 **/
public class OperationAccess implements IAbsFactory {
    private static final Logger logger = LoggerFactory.getLogger(OperationAccess.class);
    private  String addClass  = "com.tcl.designmode.creational.abstractfactory.impl.operationImpl.Operation#Add";
    private  String mulClass  = "com.tcl.designmode.creational.abstractfactory.impl.operationImpl.Operation#Mul";

    public OperationAccess(String type){
        this.addClass = this.addClass.replace("#",type);
        this.mulClass = this.mulClass.replace("#",type);
    }

    public Operation CreateAddOperation(){
        try {
            logger.info("addClass:"+addClass);
            return (Operation)this.getClass().getClassLoader().loadClass(addClass).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Operation CreateMulOperation(){
        try {
            logger.info("mulClass:"+mulClass);
            return (Operation)Thread.currentThread().getContextClassLoader().loadClass(mulClass).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }

}
