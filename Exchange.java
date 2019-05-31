package com.bittch.Day_12;

/**
 * @author CHAOQIWEN
 * @data 2019/5/31 23:51
 */
public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]=AB[0]^AB[1];
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return AB;
    }
}