package shuati;


/**
 * 83. 删除排序链表中的重复元素
 * 题目描述:
 *      给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/solution/shan-chu-pai-xu-lian-biao-zhong-de-zhong-fu-yuan-s/
 *          方法：直接法
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法：直接法, 理解, 没想出来
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * 方法：直接法
     * 思路 参考LeeCode 官网
     * 复杂度分析
     *     时间复杂度：O(n)。
     *     空间复杂度：O(1)。
     *
     * 定义 当前节点 指向 头结点
     * 循环 排序链表( 条件 = 当前节点 不为空 且 当前节点的下一个节点 不为空)
     *      如果 当前节点的下一个节点的值 与 当前节点的值 相等, 则 当前节点的下一个节点 指向 当前节点的下一个节点的下一个节点;
     *      否则 当前节点 指向 当前节点的下一个节点
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }



    public ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        while (current != null && current.next !=null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


    public ListNode deleteDuplicates3(ListNode head) {
        ListNode pointer = head;
        while (pointer != null && pointer.next != null) {
            if (pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head;
    }

}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */