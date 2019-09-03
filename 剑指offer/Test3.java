package 剑指offer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;




/**
 * @Author:chaoqiwen
 * @Date:2019/9/3 9:42
 */
public class Test3 {
    //调整数组顺序使奇数位于偶数前面
    public  static void reOrderArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j>i;j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) {
                    swap(array, j, j - 1);
                }
            }
        }
    }
    public static void swap(int[] array,int a,int b){
        int tmp=array[a];
        array[a]=array[b];
        array[b]=tmp;
    }

 /*     if(array.length<=1){
          return;
      }else {
          int i=0;
          int j=array.length-1;
          while (i<j){
              while (array[i]%2!=0){
                  i++;
              }
              while (array[j]%2==0){
                  j--;
              }
              if(i<j){
                  swap(array,i,j);
              }
          }
      }*/

      /*int length=array.length;
      int i=0;
      if(length<=1){
          return;
      }
      while (i<length){
          int j=i+1;
          while (array[i]%2!=0){
              if(j==length-1){
                  return;
              }
              j++;
          }
      }
      int count=*/






    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6};
        reOrderArray(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
