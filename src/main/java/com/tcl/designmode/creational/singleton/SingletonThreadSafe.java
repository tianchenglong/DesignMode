package com.tcl.designmode.creational.singleton;

/**
 *  单例模式   ------ 线程安全(双重检查锁)
 *
 *  Singleton mode .
 *
 *  The class is thread safe.
 *
 *  volatile
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-11-27 19:35
 * @version: 1.0
 **/
public class SingletonThreadSafe {
    private volatile static SingletonThreadSafe instance;
    private SingletonThreadSafe(){

    }
    public static SingletonThreadSafe getInstance(){
        if(null == instance){
            synchronized(SingletonThreadSafe.class){
                if(null == instance){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}
