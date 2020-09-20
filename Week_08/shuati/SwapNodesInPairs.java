package shuati;


/**
 * 24. 两两交换链表中的节点
 * 题目描述:
 *      给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *      你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/liang-liang-jiao-huan-lian-biao-zhong-de-jie-di-19/
 *          方法一：递归
 *          方法二：迭代
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：递归, 理解, 忘记了, 又抄了一遍.
 *
 */
public class SwapNodesInPairs {


    /**
     *  方法一：递归
     *  思路 参考LeeCode
     *  复杂度分析
     *       时间复杂度： O(n)
     *       空间复杂度： O(1)
     *
     *  终止条件:
     *      该节点为空 或 该节点的下一个节点为空 返回 该结点
     *      获取 该节点的下一个节点next
     *      交换 节点next
     *      next.next节点指向
     *
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;

        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        //[1,2,3,4]
        ListNode head = new ListNode();
        head.val = 1;
        ListNode next1 = new ListNode();
        next1.val = 2;
        ListNode next2 = new ListNode();
        next2.val = 3;
        ListNode next3 = new ListNode();
        next3.val = 4;

        head.next = next1;
        next1.next = next2;
        next2.next = next3;

        SwapNodesInPairs swap = new SwapNodesInPairs();
        ListNode res = swap.swapPairs(head);

        System.out.println(res);
    }




    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
}
