/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 递归解法
     时间复杂度: O(n)
     空间复杂度: O(1)
*/
class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next ==null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}