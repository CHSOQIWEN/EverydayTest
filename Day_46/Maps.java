package com.bittch.Day_46;

import java.util.*;

/**
 * @author CHAOQIWEN
 * @data 2019/7/25 11:42
 */
public class Maps {
    public static void printKeys(Map<Integer,String > map){
        System.out.println("size="+map.size());
        System.out.println("Keys="+map.keySet());
        System.out.println("value="+map.values());

    }
    public static void test(Map<Integer,String> map){

        System.out.println(map.getClass().getSimpleName());
        map.put(1,"hello");
        map.put(2,"world");
        map.put(3,"!!!");
        printKeys(map);
        map.replace(1,"2");
        map.replace(4,"2");
        printKeys(map);


    }

    public static void main(String[] args) {
        test(new HashMap<Integer, String>());
        test(new LinkedHashMap<Integer, String>());
    }
}
