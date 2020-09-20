package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. 全排列 II
 * 题目描述:
 *      给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/permutations-ii/solution/quan-pai-lie-ii-by-leetcode-solution/
 *          方法一：搜索回溯
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：搜索回溯, >不理解>理解, 看了官方题解.
 *
 */
public class PermutationsII {

    boolean[] vis;

    /**
     * 方法一：搜索回溯
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(n×n!)，其中 n 为序列的长度
     *      空间复杂度：O(n)
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> perm = new ArrayList<Integer>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, ans, 0, perm);
        return ans;
    }

    public void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm) {
        // 终止条件: 索引idx == 数组长度
        if (idx == nums.length) {
            ans.add(new ArrayList<Integer>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            //回溯状态:
            perm.add(nums[i]);
            vis[i] = true;

            backtrack(nums, ans, idx + 1, perm);

            //回溯状态:
            vis[i] = false;
            perm.remove(idx);
        }
    }

}
