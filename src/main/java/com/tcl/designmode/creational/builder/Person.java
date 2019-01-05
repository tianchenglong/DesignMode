package com.tcl.designmode.creational.builder;



import java.util.Objects;

/**
 *
 *  要创建的对象的一个类（假定这里的每个属性都必须赋值，否则就不能用）
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-01-05 22:56
 * @version: 1.0
 **/
public class Person {

    private String name ;
    private int age ;
    private int height;
    private float weigth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                height == person.height &&
                Float.compare(person.weigth, weigth) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weigth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weigth=" + weigth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
}
