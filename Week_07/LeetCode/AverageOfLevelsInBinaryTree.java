package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode 每日一题
 * 637. 二叉树的层平均值
 * 题目描述:
 *      给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/solution/er-cha-shu-de-ceng-ping-jun-zhi-by-leetcode-soluti/
 *      方法一：深度优先搜索
 *      方法二：广度优先搜索
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       广度优先搜索: 第1遍, >不理解>理解, 看懂了,抄了1遍
 */
public class AverageOfLevelsInBinaryTree {

    /**
     * 复杂度分析
     *      时间复杂度：O(n)，其中 n 是二叉树中的节点个数。
     *      空间复杂度：O(n)，其中 n 是二叉树中的节点个数。空间复杂度取决于队列开销，队列中的节点个数不会超过 n。
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            averages.add(sum / size);
        }
        return averages;
    }

}
