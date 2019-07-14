package com.bittch.Day_37;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/14 19:54
 */
public class MuBangPinTu {
    public static boolean canget(ArrayList<Integer> list){
        int len=list.size();
        for(int i=0;i<len;i++){
            int tmp=list.remove(i);
            int sum=0;
            for(int j=0;j<len-1;j++){
                sum+=list.get(j);

            }
            if(sum<=tmp){
                list.add(i,tmp);
                return false;
            }
            list.add(i,tmp);
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> m =new ArrayList<>();
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                int o=scanner.nextInt();
                int l=scanner.nextInt();
                if(o==1){
                    m.add(l);
                }else {
                    m.remove(new Integer(l));
                }
                if(canget(m)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }

    }
}
