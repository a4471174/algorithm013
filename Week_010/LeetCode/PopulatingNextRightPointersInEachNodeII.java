package LeetCode;


import java.util.LinkedList;

/**
 * 117. 填充每个节点的下一个右侧节点指针 II
 * 题目描述:
 *      给定一个二叉树
 *      填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *      初始状态下，所有 next 指针都被设置为 NULL。
 *      进阶：
 *          你只能使用常量级额外空间。
 *          使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/solution/tian-chong-mei-ge-jie-dian-de-xia-yi-ge-you-ce-15/
 *          方法一：层次遍历
 *              淺い空 改进版
 *          方法二：使用已建立的 \rm nextnext 指针
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：层次遍历 , 想到了 广度优先遍历, 但是模板给忘记了.
 *
 */
public class PopulatingNextRightPointersInEachNodeII {


    /**
     * 方法一：层次遍历 淺い空 改进版
     * 思路 参考LeeCode 官网
     * 复杂度分析
     *     时间复杂度：O(n)。
     *     空间复杂度：O(n)。
     */
    public Node connect(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size() - 1;
            Node pre = new Node();
            Node cur = queue.poll();
            while (len >= 0) {
                pre.next = cur;
                pre = cur;
                cur = len != 0 ? queue.poll() : null;
                if (pre != null && pre.left != null) queue.offer(pre.left);
                if (pre != null && pre.right != null) queue.offer(pre.right);
                len--;
            }
        }
        return root;
    }
}


/*
// Definition for a Node.
*/
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
