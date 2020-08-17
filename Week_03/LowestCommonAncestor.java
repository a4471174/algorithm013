
/**
 *
 *
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 * 题目描述:
 *      给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 */
public class LowestCommonAncestor {


    /**
     *  方法1: 栈
     *      思路
     *          参考LeeCode
     *      复杂度分析
     *          时间复杂度 O(N) ： 其中 N 为二叉树节点数；最差情况下，需要递归遍历树的所有节点。
     *          空间复杂度 O(N) ： 最差情况下，递归深度达到 N ，系统使用 O(N) 大小的额外空间。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
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