package 笔试;

import java.util.Scanner;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/12 10:29
 */
public class java12 {
    public static String add(String str1,String str2){
        if(str1==null||"".equals(str1)){
            return str2;
        }
        if(str2==null||"".equals(str2)){
            return str1;
        }

        StringBuilder sb=new StringBuilder();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        int index1=arr1.length-1;
        int index2=arr2.length-1;

        boolean carry=false;
        while (index1>=0&&index2>=0){
            char cur1=arr1[index1];
            char cur2=arr2[index2];

            int mid=cur1-'0'+cur2-'0';
            mid=carry?mid+1:mid;
            if(mid>=10){
                carry=true;
            }else {
                carry=false;
            }

            sb.append((char)((mid%10)+'0'));
            index1--;
            index2--;
        }

        if(carry){
            if(index1>=0){
                sb.append((char)(arr1[index1]+1));
                index1--;
            }else if(index2>=0){
                sb.append((char)(arr1[index2]+1));
                index2--;
            }else {
                sb.append('1');
            }
        }
        while (index1>=0){
            sb.append(arr1[index1--]);
        }
        while (index2>=0){
            sb.append(arr2[index2--]);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String num1=scanner.next();
            String num2=scanner.next();
            System.out.println(add(num1,num2));
        }
    }
}
