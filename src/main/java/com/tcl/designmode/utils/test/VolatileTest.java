package com.tcl.designmode.utils.test;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-13 22:29
 * @version: 1.0
 **/
public class VolatileTest {
    public static  void main(String[] args){
        A a = new A();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                a.writer();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.reader();
            }
        });

        thread.start();
        thread2.start();


    }
}
