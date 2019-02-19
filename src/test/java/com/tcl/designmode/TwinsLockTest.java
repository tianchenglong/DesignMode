package com.tcl.designmode;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-02-19 15:53
 * @version: 1.0
 **/
public class TwinsLockTest {

    final Lock lock  =  new TwinsLock();
    public static void main(String[] args){
        TwinsLockTest  tt=  new  TwinsLockTest();
       //启动10个线程
        for(int i=0;i<10;i++){
            Worker w  = tt.new Worker(null,"name-"+i);
             w.setDaemon(true);
             w.start();
        }

        //每隔1秒换行
        for(int i=0;i<100;i++){
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("=======================================");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    class Worker extends  Thread{
        public Worker(ThreadGroup group, String name){
            super( group,  name);
        }
        @Override
        public void run() {
            super.run();

            while (true){

                lock.lock();
                try {

                    try {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(Thread.currentThread().getName());
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }finally {
                    lock.unlock();
                }

            }
        }
    }



}
