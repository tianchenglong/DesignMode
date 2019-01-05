package com.tcl.designmode.creational.builder;

/**
 *
 *  创建一个person 对象
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-05 23:08
 * @version: 1.0
 **/
public class ConcreateBuilderB implements Builder {
    private Person person = new Person();

    @Override
    public void setName() {
        person.setName("小B");
    }

    @Override
    public void setAge() {
        person.setAge(20);
    }

    @Override
    public void setHeight() {
        person.setHeight(170);
    }

    @Override
    public void setWeigth() {
        person.setWeigth(110.22f);
    }

    @Override
    public Person createPerson() {
        return person;
    }
}
