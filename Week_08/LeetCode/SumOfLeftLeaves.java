package LeetCode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 404. 左叶子之和
 * 题目描述:
 *      计算给定二叉树的所有左叶子之和。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/sum-of-left-leaves/solution/zuo-xie-zi-zhi-he-by-leetcode-solution/
 *          方法一：深度优先搜索
 *          方法二：广度优先搜索
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：深度优先搜索, 理解, 看了官方题解,抄了一遍.
 *
 */
public class SumOfLeftLeaves {

    /**
     * 方法一：深度优先搜索
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(n)，其中 n 是树中的节点个数。
     *      空间复杂度：O(n)。空间复杂度与深度优先搜索使用的栈的最大深度相关。在最坏的情况下，树呈现链式结构，深度为 O(n)，对应的空间复杂度也为 O(n)。
     *
     * 如果根节点不为空, 进行深度优先搜索, 否则返回0
     */
    public int sumOfLeftLeaves11(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    /**
     * 定义 ans=0(二叉树的所有左叶子之和)
     * 若该节点的左子节点不为空, 就判断该节点的左子节点是否为叶子节点。若是左叶子节点,ans+=左叶子节点之和,否则继续下探一层
     * 若该节点的右子节点不为空, 且该节点的右子节点不为叶子节点, 则继续下探.
     * @param node 节点
     * @return
     */
    public int dfs(TreeNode node) {
        // 定义 ans=0(二叉树的所有左叶子之和)
        int ans = 0;
        // 若该节点的左子节点不为空, 就判断该节点的左子节点是否为叶子节点。
        // 若是左叶子节点,ans+=左叶子节点之和,否则继续下探一层
        if (node.left != null) {
            ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }
        // 若该节点的右子节点不为空, 且该节点的右子节点不为叶子节点, 则继续下探.
        if (node.right != null && !isLeafNode(node.right)) {
            ans += dfs(node.right);
        }

        return ans;
    }

    // 判断节点是否为叶子节点（节点下无左右节点）
    public boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }








    /**
     * 方法二：广度优先搜索
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(n)，其中 nn 是树中的节点个数。
     *      空间复杂度：O(n)。空间复杂度与广度优先搜索使用的队列需要的容量相关，为O(n)。
     */
    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (isLeafNode(node.left)) {
                    ans += node.left.val;
                } else {
                    queue.offer(node.left);
                }
            }
            if (node.right != null) {
                if (!isLeafNode(node.right)) {
                    queue.offer(node.right);
                }
            }
        }
        return ans;
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
