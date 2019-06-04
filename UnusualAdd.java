package com.bittch.Day_15;

/**
 * @author CHAOQIWEN
 * @data 2019/6/5 0:07
 */
public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        if(B==0){
            return A;
        }
        int sum=0;
        int and=0;
        sum=A^B;
        and=(A&B)<<1;
        return addAB(sum,and);
    }
}
