package com.bittch.Day_38;

import java.lang.reflect.Field;
import java.net.ServerSocket;

/**
 * @author CHAOQIWEN
 * @data 2019/7/16 17:20
 */
class Myclass<T,E>{
    private T value1;
    private  E value2;



    public T getValue1() {
        return value1;
    }
    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }
}
//类型擦除
class Myclass2<T>{
    T t;
}

class  Myclass3<T,E>{
    public T t;
    public E e;
}

class  Myclass4<T extends Number,E extends Number>{
    public T t;
    public E e;
}

public class FanXingTest {
    public static void main(String[] args) {

        //类型擦除
        Myclass2<String> myclass21=new Myclass2<>();
        Myclass2<Integer> myclass22=new Myclass2<>();
        System.out.println(myclass21.getClass()==myclass22.getClass());

        Myclass3<Integer,String> myclass3=new Myclass3<>();
        Field[] fields3=myclass3.getClass().getDeclaredFields();
        for(Field field:fields3){
            System.out.println(field.getType());
        }

        Myclass4<Integer,Double> myclass4=new Myclass4<>();
        Field[] fields4=myclass4.getClass().getDeclaredFields();
        for(Field field:fields4){
            System.out.println(field.getType());
        }

    }
}
