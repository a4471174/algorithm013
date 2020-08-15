import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * 题目描述:
 *      给定一个二叉树，返回它的中序 遍历。
 *
 *
 */
public class InorderTraversal {

    /**
     *  方法1: 递归
     *      思路
     *          参考LeeCode
     *
     *      复杂度分析
     *          时间复杂度：O(n)。递归函数 T(n) = 2T(n/2)+1。
     *          空间复杂度：最坏情况下需要空间O(n)，平均情况为O(logn)。
     *
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


/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
