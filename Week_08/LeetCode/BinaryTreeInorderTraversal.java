package LeetCode;

import java.util.ArrayList;
import java.util.List;


/**
 * 94. 二叉树的中序遍历
 * 题目描述:
 *      给定一个二叉树，返回它的中序 遍历。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/er-cha-shu-de-zhong-xu-bian-li-by-leetcode-solutio/
 *          方法一：递归
 *          方法二：栈
 *          方法三：Morris 中序遍历
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      递归： 理解
 *
 */
public class BinaryTreeInorderTraversal {

    /**
     *  方法1: 递归
     *  思路 参考LeeCode
     *   复杂度分析
     *          时间复杂度：O(n)。递归函数 T(n) = 2T(n/2)+1。
     *          空间复杂度：最坏情况下需要空间O(n)，平均情况为O(logn)。
     */
    public List< Integer > inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) return;
        if (root.left != null) helper(root.left, res);
        res.add(root.val);
        if (root.right != null) helper(root.right, res);
    }
}
