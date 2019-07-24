package com.bittch.Day_45;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/24 10:10
 */
public class PingPong2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str1=scanner.next();
            String str2=scanner.next();
            HashMap<String,Integer> mapA= new HashMap<>();
            HashMap<String,Integer> mapB=new HashMap<>();
            for(int i=0;i<str1.length();i++) {
                if (mapA.containsKey(str1.charAt(i) +"")){
                    mapA.put((str1.charAt(i)+""),mapA.get(str1.charAt(i)+"")+1);
                }else {
                    mapA.put((str1.charAt(i)+""),1);
                }
            }
            for(int i=0;i<str2.length();i++) {
                if (mapB.containsKey(str2.charAt(i) +"")){
                    mapB.put((str2.charAt(i)+""),mapB.get(str2.charAt(i)+"")+1);
                }else {
                    mapB.put((str2.charAt(i)+""),1);
                }
            }
            int flag=0;
            for(String key:mapB.keySet()){
                if(!mapA.containsKey(key)){
                    flag=1;
                    break;
                }else {
                    if(mapA.get(key)<mapB.get(key)){
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println(flag==1?"No":"Yes");
        }
    }

}
