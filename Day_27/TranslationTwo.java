package com.bittch.Day_27;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/3 18:50
 */
public class TranslationTwo {
    public static void Translation(String n){

       Long tmp=Long.parseLong(n);
       String ip=Long.toBinaryString(tmp);

       StringBuffer sb=new StringBuffer();
       if(ip.length()<32){
           for(int i=0;i<(32-ip.length());i++){
               sb.append(0);
           }
           sb.append(ip);
       }else {
           sb.append(ip);
       }

       for(int i=0;i<sb.length()-8;i=i+8){
           System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
       }
       System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));

    }
    public  static long IptoTen(String ip) {
        String[] arr=ip.split("\\.");
        long n=Long.parseLong(arr[0]);

        for(int i=1;i<arr.length;i++){
            n=n<<8;
            n=n+Long.parseLong(arr[i]);
        }

        return n;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String ip=scanner.nextLine();
            String n=scanner.nextLine();
            System.out.println(IptoTen(ip));
            Translation(n);
        }


    }
}
