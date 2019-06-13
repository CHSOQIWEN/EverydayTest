package com.bittch.Day_22;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/13 10:14
 */
public class ChuanZhuZi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tanzhu=scanner.next();
        boolean[] tanzhu1=new boolean[tanzhu.length()];
        String Buy=scanner.next();
        boolean[] Buy1=new boolean[Buy.length()];
        int count=0;
        for(int i=0;i<tanzhu1.length;i++){
            tanzhu1[i]=true;
        }
        for(int i=0;i<Buy1.length;i++){
            Buy1[i]=true;
        }
        for(int i=0;i<Buy.length();i++){
          for(int j=0;j<tanzhu1.length;j++){
              if(Buy.charAt(i)==tanzhu.charAt(j)&&tanzhu1[j]==true&&Buy1[i]==true){
                 count++;
                 tanzhu1[j]=false;
                 Buy1[i]=true;
                 break;

              }

          }

        }
        if(count==Buy.length()){
            int e=tanzhu1.length-count;
            System.out.println("yes"+" "+e);
        }else {
            int e=Buy.length()-count;
            System.out.println("No"+" "+e);
        }
    }

}
