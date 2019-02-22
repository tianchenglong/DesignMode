package com.tcl.designmode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-02-22 16:41
 * @version: 1.0
 **/
public class BoundedQueue<T> {
    private Object[] items;
    // 添加的下标，删除的下标和数组当前的数量
    private int addIndex,removeIndex,count;

    private Lock lock = new ReentrantLock();
    private Condition  notEmpty =  lock.newCondition();
    private Condition  notFull  =  lock.newCondition();

    public BoundedQueue(int size){
         items = new Object[size];
    }

    public void add(T t) throws InterruptedException{
        lock.lock();
        try {
            while (count == items.length){
                notFull.await();
            }
            items[addIndex] =t;
            if(++addIndex ==items.length){
                addIndex =0;
            }
            ++count;
            notEmpty.signal();
         }finally {
            lock.unlock();
        }
    }

    public T getItem()throws InterruptedException{
        lock.lock();
        try {

            while (count ==0){
                notEmpty.wait();
            }

            Object x = items[removeIndex];

            if(++removeIndex ==items.length)
            {
                removeIndex =0;
            }
            --count;
            notFull.signal();
            return (T)x;

        }finally {
            lock.unlock();
        }
    }
}
