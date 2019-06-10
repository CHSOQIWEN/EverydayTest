package com.bittch.Day_20;

/**
 * @author CHAOQIWEN
 * @data 2019/6/10 23:58
 */
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition2 {
    public ListNode partition(ListNode pHead, int x) {
        // write code here

        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode a=small;
        ListNode b=big;
        while (pHead!=null){
            if(pHead.val<x){
                small.next=new ListNode(pHead.val);
                small=small.next;
            }else {
                big.next=new ListNode(pHead.val);
                big=big.next;
            }
            pHead=pHead.next;
        }
        small.next=b.next;
        return a.next;
    }

}
