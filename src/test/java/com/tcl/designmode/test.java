package com.tcl.designmode;

/**
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-12-17 22:56
 * @version: 1.0
 **/
public class test {
    public static void main(String [] args){
        test();


    }

    private static void test() {
        Integer a =1;
        Integer b =2;
        Integer c =3;
        Integer d = 3;
        Integer e  =321;
        Integer f   =321;
        Long g =3l;
        System.out.println(c ==d);
        System.out.println(e== f);
        System.out.println(c ==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
    }
}
