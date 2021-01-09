package com.tcl.designmode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 *
 * 求 两个集合里面数据的交集
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-02-21 17:02
 * @version: 1.0
 **/
public class Intersection {

    public static void main(String[] args){
       /* List a  = new ArrayList();
        List b  = new ArrayList();
        a.add(2);
        for(int i =0 ;i<1000000;i++){
            a.add(i);
        }

        for(int i =1 ;i<=400000;i++){
            b.add(i);
        }*/
/*
        System.out.println("第一个");
        showList(a);
        System.out.println("第二个");
        showList(b);*/
        System.out.println("========通过两个for循环 时间复杂度 M*N=================");
        //showList(doubleFor(a,b));
       // doubleFor(a,b);


        List c  = new ArrayList();
        List d  = new ArrayList();
        c.add(2);
        for(int i =0 ;i<100000000;i++){
            c.add(i);
        }

        for(int i =1 ;i<=4000000;i++){
            d.add(i);
        }
       /* System.out.println("第一个");
        showList(c);
        System.out.println("第二个");
        showList(d);*/
        try {
            TimeUnit.SECONDS.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("========通过hashMap  时间复杂度M+N=================");
        //showList(hash(c,d));
        hash(c,d);
    }

    /**
     * 通过两个for循环 时间复杂度 M*N
     */
    public static List doubleFor(List a,List b){
       long start  = System.currentTimeMillis();
       if(a.retainAll(b)){
           System.out.println("用时："+(System.currentTimeMillis()-start)+" 毫秒");
           return b ;
       }else {
           System.out.println("用时："+(System.currentTimeMillis()-start)+" 毫秒");
           return new ArrayList();
       }

    }


    /**
     * 通过hashMap  时间复杂度M+N
     */
    public static List hash(List a,List b){
        long start  = System.currentTimeMillis();
        List result  = new ArrayList();
        /**
         * 第一步：先把其中一个list转换成 hashmap, list的value 作为key ,次数作为值
         */
        Map<Object,Integer>  map  = new HashMap(a.size());
        for(Object o : a){
            if(map.containsKey(o)){
               map.put(o,map.get(o)+1) ;
            }else{
                map.put(o,1) ;
            }
        }

        for(Object o : b){

            if(map.containsKey(o)){
                for(int i=0 ,n= map.get(o).intValue();i<n;i++){
                    result.add(o);
                }
            }
        }


        System.out.println("用时："+(System.currentTimeMillis()-start)+"毫秒");

       return result;

    }



    public static void showList(List list){
        for(Object o :list){
            System.out.print(o.toString()+",");
        }
        System.out.println();
    }
}
