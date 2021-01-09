package com.tcl.designmode.creational.builder;

/**
 *  用于创建一个对象的的接口类，创建具体的person 对象，通过实现这个类
 */
public interface Builder {


    public void setName();



    public void setAge() ;



    public void setHeight() ;



    public void setWeigth() ;


    public Person createPerson();
}
