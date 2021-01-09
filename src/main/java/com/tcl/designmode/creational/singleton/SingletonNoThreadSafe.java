package com.tcl.designmode.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例模式-----------非线程安全
 * Singleton mode.
 * The class is not thread-safe.
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-11-27 19:20
 * @version: 1.0
 **/
public class SingletonNoThreadSafe {
    private final  static Logger logger  = LoggerFactory.getLogger(SingletonNoThreadSafe.class);
    private static SingletonNoThreadSafe instance;

    private SingletonNoThreadSafe(){}

    public static SingletonNoThreadSafe getInstance(){
        if(null ==instance){
            instance  = new SingletonNoThreadSafe();
        }
        return instance;
    }

}
