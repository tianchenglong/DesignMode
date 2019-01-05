package com.tcl.designmode.creational.builder;

/**
 * 创建一个person 对象
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-05 23:08
 * @version: 1.0
 **/
public class ConcreateBuilderA implements Builder {
    private Person person = new Person();

    @Override
    public void setName() {
        person.setName("小A");
    }

    @Override
    public void setAge() {
        person.setAge(18);
    }

    @Override
    public void setHeight() {
        person.setHeight(180);
    }

    @Override
    public void setWeigth() {
        person.setWeigth(150.22f);
    }

    @Override
    public Person createPerson() {
        return person;
    }
}
