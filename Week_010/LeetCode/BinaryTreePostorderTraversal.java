package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * 题目描述:
 *      给定一个二叉树，返回它的 后序 遍历。
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/solution/er-cha-shu-de-hou-xu-bian-li-by-leetcode-solution/
 *          方法一：递归
 *          方法二：迭代
 *          方法三：Morris 遍历
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：递归, 理解, 但是第一次实现时程序不通过.
 */
public class BinaryTreePostorderTraversal {

    /**
     * 方法一：递归
     * 思路 参考LeeCode 官网
     * 复杂度分析
     *     时间复杂度：O(n)。
     *     空间复杂度：O(n)。
     *
     * 1. 定义 列表  List<Integer> res
     * 2. 通过递归方式实现 后序遍历(左右根) 二叉树
     *      终止条件: 如果 当前节点 是否为空, 则返回
     *      下探一层:
     *          node.left,
     *          node.right
     *      res 添加 当前节点的值
     *
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder2(root, res);
        return res;
    }

    private void postorder2(TreeNode node, List<Integer> res) {
        if (node == null) return;
        postorder2(node.left, res);
        postorder2(node.right, res);
        res.add(node.val);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */