package com.bittch.Day_43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/22 9:31
 */
public class TelephoneNumber {
    public static void main(String[] args) {
        String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String b="222333444555666777788899991234567890";
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            ArrayList<String> arrayList=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str=scanner.next();
                str=str.replace("-","");
                String c="";
                for(int j=0;j<7;j++){
                    c+=b.charAt(a.indexOf(str.charAt(j)+""));
                }
                c=c.substring(0,3)+"-"+c.substring(3,7);
                if(!arrayList.contains(c)){
                    arrayList.add(c);
                }
            }
            Collections.sort(arrayList);
            for(int i=0;i<arrayList.size();i++){
                System.out.println(arrayList.get(i));
            }
            System.out.println();
        }
    }
}
