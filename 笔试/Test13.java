package 笔试;

import java.util.Scanner;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/12 10:49
 */
public class Test13 {
    public  static  String sum(String str){
        boolean flag=false;
        if(str==null||str.isEmpty()){
           // System.out.println("null");
            return null;
        }else {
            char test=str.charAt(0);
            StringBuffer mystr=new StringBuffer();
            int count=1;
            for(int i=1;i<str.length();i++){
                if(test==str.charAt(i)){
                    count++;
                }else {

                    if(count>1){
                        mystr.append(count);
                        mystr.append(test);
                        flag=true;
                    }
                    test=str.charAt(i);
                    count=1;
                }
            }

            if(count>1){
                mystr.append(count);
                mystr.append(test);
                flag=true;
            }
            if(flag){
                //System.out.println("mystr.length()="+mystr.length());
                //System.out.println("mystr.toString()="+mystr.toString());
                return mystr.toString();
            }else {
               // System.out.println("没有改变"+str);
                return str;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.next();
            System.out.println(sum(s));
        }
    }
}
