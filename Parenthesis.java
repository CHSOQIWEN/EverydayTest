package com.bittch.Day_03;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        int count=0;
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            if(c == '('){
                count++;
            }else if(c==')'){
                if(count>0){
                    count--;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return count==0;
    }
}
