package com.bittch.Day_31;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/7 20:32
 */
public class FindMistake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while (scanner.hasNext()){
            String a1=scanner.nextLine();
            String[] a2=a1.split("\\\\| ");
            String a3=a2[a2.length-2];
            if(a3.length()>16){
                a3=a3.substring(a3.length()-16);
            }

            String key = a3 + " " + a2[a2.length-1];
            int value = 1;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, value);
            }
        }
        int count = 0;
        for(String string : map.keySet()){
            count++;
            if(count > (map.keySet().size()-8))
                System.out.println(string+" "+map.get(string));

        }
    }
}
