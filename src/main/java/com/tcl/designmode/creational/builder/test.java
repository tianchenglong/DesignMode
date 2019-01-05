package com.tcl.designmode.creational.builder;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 *  建造者模式
 *
 *  将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 *  感悟：建造者模式，可以防止在复杂的初始化流程里，避免遗漏步骤。把要处理的步骤统一的放在一个地方处理。
 *
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-05 23:27
 * @version: 1.0
 **/
public class test {

    public static  void main(String[] args){
        Director director = new Director();
        ConcreateBuilderA a = new ConcreateBuilderA();
        ConcreateBuilderB b = new ConcreateBuilderB();
        director.CreatePerson(a);

        System.out.println(a.createPerson().toString());

        director.CreatePerson(b);

        System.out.println(b.createPerson().toString());


    }
}
