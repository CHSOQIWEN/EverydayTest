package com.bittch.Day_42;

import java.lang.reflect.Method;

/**
 * @author CHAOQIWEN
 * @data 2019/7/21 16:36
 */
class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class FanSheTest2 {
    public static void main(String[] args) throws Exception {
        Class<?> cls=Person.class;
        Person per=(Person)cls.newInstance();
        Method setMethod=cls.getMethod("setName", String.class);
        setMethod.invoke(per,"lisi");
        System.out.println(per);
        Method setMethod2=cls.getMethod("setAge", int.class);
        setMethod2.invoke(per,30);
        System.out.println(per);

    }
}
