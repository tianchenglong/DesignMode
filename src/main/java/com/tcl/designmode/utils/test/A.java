package com.tcl.designmode.utils.test;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-13 22:29
 * @version: 1.0
 **/
public class A {

    private int a  = 0;
    private   boolean b = false;

    public void writer(){

        b=true;
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("writer.1...");
        for (long i=0 ,n=100000000l;i<n;i++)
            a++;
        System.out.println("writer....");

    }

    public  void reader(){
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("reader....");

        if(b){
            System.out.println(a);
        }
    }
}
