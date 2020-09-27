package LeetCode;

/**
 * 538. 把二叉搜索树转换为累加树
 * 题目描述:
 *      给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 *
 * 题解:
 *      官方:https://leetcode-cn.com/problems/convert-bst-to-greater-tree/solution/ba-er-cha-sou-suo-shu-zhuan-huan-wei-lei-jia-sh-14/
 *          方法一：反序中序遍历
 *          方法二：Morris 遍历
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：反序中序遍历, 理解, 但是没想出来, 把二叉搜索树性质忘记了.
 *
 */
public class ConvertBSTtoGreaterTree {

    int sum = 0;

    /**
     * 方法一：反序中序遍历
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(N)。
     *     空间复杂度：O(N)。
     */
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }



    public TreeNode convertBST2(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return  root;
    }

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
