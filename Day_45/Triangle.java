package com.bittch.Day_45;

import java.util.ArrayList;

/**
 * @author CHAOQIWEN
 * @data 2019/7/24 17:20
 */
public class Triangle {

    public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int sum=Result(triangle,0,0);
        return sum;

    }
    public static int Result(ArrayList<ArrayList<Integer>> triangle,int l,int k){
        int sum=triangle.get(l).get(k);
        if(l<triangle.size()-1){
            sum+=Math.min(Result(triangle,l+1,k),Result(triangle,l+1,k+1));
        }
        return sum;
    }
}
