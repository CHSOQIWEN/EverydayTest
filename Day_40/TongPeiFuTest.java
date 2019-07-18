package com.bittch.Day_40;

import javax.naming.NameNotFoundException;

/**
 * @author CHAOQIWEN
 * @data 2019/7/18 11:12
 */
class Message<T >{
    private T m;

    public T getM() {
        return m;
    }

    public void setM(T m) {
        this.m = m;
    }
}
public class TongPeiFuTest {
    public static void fun(Message<? super Integer> t){
        System.out.println(t.getM());
    }
    public static void main(String[] args) {
        Message<Number > message=new Message<>();
        message.setM(12.3);
        fun(message);

    }
}
