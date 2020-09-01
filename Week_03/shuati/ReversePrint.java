package shuati;

import shuati.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 *
 * 剑指 Offer 06. 从尾到头打印链表
 * 题目描述:
 *      输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 */
public class ReversePrint {

    /**
     *  方法1: 栈
     *      思路
     *          参考LeeCode
     *      复杂度分析
     *          时间复杂度：O(n)。正向遍历一遍链表，然后从栈弹出全部节点，等于又反向遍历一遍链表。
     *          空间复杂度：O(n)。额外使用一个栈存储链表中的每个节点。
     */
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++)
            print[i] = stack.pop();
        return print;
    }


    /**
     * 方法2：递归法
     *      思路
     *          参考LeeCode
     *      复杂度分析
     *          时间复杂度 O(N)： 遍历链表，递归 NN 次。
     *          空间复杂度 O(N)： 系统递归需要使用 O(N)O(N) 的栈空间。
     */
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint2(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }

    private void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}


/**
 * Definition for singly-linked list.
 * public class shuati.ListNode {
 *     int val;
 *     shuati.ListNode next;
 *     shuati.ListNode(int x) { val = x; }
 * }
 * */