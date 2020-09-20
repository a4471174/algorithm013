package LeetCode;

/**
 * 226. 翻转二叉树
 * 题目描述:
 *      翻转一棵二叉树。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/invert-binary-tree/solution/fan-zhuan-er-cha-shu-by-leetcode-solution/
 *          方法一：递归
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：递归, 理解, 看了官方题解
 *
 */
public class InvertBinaryTree {

    /**
     * 方法一：递归
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(N)
     *      空间复杂度：O(N)
     *
     *
     * 终止条件:
     *      节点为空,返回空
     *
     * 处理逻辑:
     *      节点的子左节点反转
     *      节点的子右节点反转
     *      子左节点 == 子右节点
     *      子右节点 == 子左节点
     *
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
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
