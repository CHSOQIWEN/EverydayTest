package com.bittch.Day_42;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/20 18:58
 */
public class StrMima {
    public static char  translate(char a){//加密
        if(a>='0'&&a<'9'){
            return (char) (a+1);
        }else if(a=='9'){
            return '0';
        }else if(a>='A'&&a<'Z'){
            return (char)(a+1+32);
        }else if(a=='Z'){
            return 'a';
        }else if(a>='a'&&a<'z'){
            return (char)(a+1-32);
        }else if(a=='z'){
            return 'A';
        }else {
            return a;
        }
    }
    public static char translate2(char a){//解密
        if(a>'0'&&a<='9'){
            return (char)(a-1);
        }else if(a=='0'){
            return '9';
        }else if(a>'A'&&a<='Z'){
            return (char)(a-1+32);
        }else if(a=='A'){
            return 'z';
        }else if(a>'a'&&a<='z'){
            return (char)(a-1-32);
        }else if(a=='a'){
            return 'Z';
        }else {
            return a;
        }
    }
    public static void Encypt(char[] password){
        StringBuffer sb=new StringBuffer();
        char[] result=new char[password.length];
        for(int i=0;i<password.length;i++){
            result[i]=translate(password[i]);
            sb.append(result[i]);

        }
        System.out.println(sb.toString());

    }
    public static void UnEncypt(char[] password){
        StringBuffer sb=new StringBuffer();
        char[] result=new char[password.length];
        for(int i=0;i<password.length;i++){
            result[i]=translate2(password[i]);
            sb.append(result[i]);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String a=scanner.nextLine();
            String b=scanner.nextLine();
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();
            Encypt(a1);
            UnEncypt(b1);

        }

    }
}
