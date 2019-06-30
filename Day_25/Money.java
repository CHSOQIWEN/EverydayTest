package com.bittch.Day_25;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/30 20:49
 */
public class Money {
    public static String diyibu(int a){
        String[] hanzi ={"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
        int qianwei=a/1000;
        int baiwei=(a-qianwei*1000)/100;
        int shiwei=(a-qianwei*1000-baiwei*100)/10;
        int gewei=a-qianwei*1000-baiwei*100-shiwei*10;
        StringBuffer str=new StringBuffer();
        if(qianwei!=0){
            str.append(hanzi[qianwei]+"仟");
        }
        if(baiwei!=0){
            str.append(hanzi[baiwei]+"佰");
        }
        if(shiwei!=0){
            if(shiwei==1){
                str.append("拾");
            }else {
                str.append(hanzi[shiwei] + "拾");
            }
        }
        if(gewei!=0){
            str.append(hanzi[gewei]);
        }
        String r=str.toString();
        return r;


    }

    public static void main(String[] args) {
        String[] a={"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            double n=scanner.nextDouble();
            StringBuffer str=new StringBuffer();
            int yiwei=(int)n/100000000;
            int wanwei=(int)((n-yiwei*100000000)/10000);
            int gewei=(int)n-yiwei*100000000-wanwei*10000;
            System.out.print("人民币");
            if(yiwei!=0){
                str.append(diyibu(yiwei)+"亿");
            }
            if(wanwei!=0){
                str.append(diyibu(wanwei)+"万");
            }
            if(gewei!=0){
                str.append(diyibu(gewei)+"元");
            }

            int xiaoshu=(int) ((n - yiwei * 100000000 - wanwei * 10000-gewei+0.001)*100);
            int jiao=xiaoshu/10;
            int fen=xiaoshu%10;
            if(jiao!=0&&fen!=0){
                str.append(a[jiao]+"角"+a[fen]+"分");
            }else if(jiao!=0&&fen==0){
                str.append(a[jiao]+"角");
            } else if (jiao==0&&fen!=0) {
                str.append(a[fen]+"分");

            }else if (jiao==0&&fen==0) {
                str.append("整");
            }
            String string=str.toString();
            System.out.println(string);

        }
    }
}
