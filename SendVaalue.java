package com.bittch.Day_18;

/**
 * @author CHAOQIWEN
 * @data 2019/6/8 14:18
 */
public class SendVaalue {
    public String str="6";

    public static void main(String[] args) {
        SendVaalue sv=new SendVaalue();
        sv.change(sv.str);
        System.out.println(sv.str);
    }
    public void change(String str){
        str="10";
    }
}
