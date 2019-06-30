package com.bittch.Day_25;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/30 19:58
 */

public class XueFenJiDian {
    public static double getJidian(int x){
        if(x>=90&&x<=100){
            return 4.0;
        }
        else if(x>=85&&x<=89){
            return 3.7;
        }
        else if(x>=82&&x<=84){
            return 3.3;
        }
        else if(x>=78&&x<=81){
            return 3.0;
        }
        else if(x>=75&&x<=77){
            return 2.7;
        }
        else if(x>=72&&x<=74){
            return 2.3;
        }
        else if(x>=68&&x<=71){
            return 2.0;
        }
        else if(x>=64&&x<=67){
            return 1.5;
        }
        else if(x>=60&&x<=63){
            return 1.0;
        }else {
            return 0;
        }

    }






    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int[] a=new int[n];//相应课程的学分
            int[] b=new int[n];//相应课程的实际得分
            double[] c=new double[n];//学分绩点
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=scanner.nextInt();
            }
            int suma=0;
            double sumc=0;
            for(int i=0;i<n;i++){
                c[i]=a[i]*getJidian(b[i]);


            }
            for(int i=0;i<n;i++){
                suma+=a[i];
                sumc+=c[i];
            }



            double s=Math.round(sumc/suma*100);
            double all=s/100.0;
            System.out.println(all);


        }

    }
}

