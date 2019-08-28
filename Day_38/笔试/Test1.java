package 笔试;

import java.util.Arrays;
import java.util.Scanner;



/**
 * @Author:chaoqiwen
 * @Date:2019/8/16 18:13
 */
public class Test1 {
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String x=scanner.next();
        char[] y=x.toCharArray();

        int[] q=new int[y.length];
        for(int i=0;i<y.length;i++){
           // System.out.println(y[i]);
            if(y[i]>='0'&&y[i]<='9'){
                q[i]=y[i];


                //System.out.println(q[i]);

                sort(q);
                System.out.println(q[i]);



            }

        }


/*
        if(q==null){
            System.out.println("-1");
        }else {
            for(int i=0;i<q.length;i++) {

                System.out.println(q[i]);
            }
        }*/

    }
}
