package LeetCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 113. 路径总和 II
 * 题目描述:
 *      给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *      说明: 叶子节点是指没有子节点的节点。
 *
 *
 * 题解:
 *      官方:https://leetcode-cn.com/problems/path-sum-ii/solution/lu-jing-zong-he-ii-by-leetcode-solution/
 *          方法一：深度优先搜索
 *          方法二：广度优先搜索
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：深度优先搜索, 理解, 但是没写出来
 *
 */
public class PathSumII {

    /**
     * 方法一：深度优先搜索
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(N^2)。
     *     空间复杂度：O(N)。
     */
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return ret;
    }

    public void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.pollLast();
    }
}
