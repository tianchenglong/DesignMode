package com.tcl.designmode.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-11-27 19:30
 * @version: 1.0
 **/
public class singletonTest {
    private final  static Logger logger  = LoggerFactory.getLogger(singletonTest.class);
    public static void main(String[] args){
        SingletonNoThreadSafe s1  = SingletonNoThreadSafe.getInstance();
        SingletonNoThreadSafe s2  = SingletonNoThreadSafe.getInstance();
        if(s1 == s2){
            logger.info("一样的对象");
        }
    }
}
