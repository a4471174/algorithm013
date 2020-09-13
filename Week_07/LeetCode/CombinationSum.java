package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 每日一题
 * 39. 组合总和
 * 题目描述:
 *     给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *      candidates 中的数字可以无限制重复被选取。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/combination-sum/solution/zu-he-zong-he-by-leetcode-solution/
 *      方法一：搜索回溯
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       第1遍, 不理解, 没看懂抄了1遍
 *       第2遍, >理解>不理解
 */
public class CombinationSum {


    /**
     * 方法一：搜索回溯
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(S)。
     *      空间复杂度：O(target)。
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs2(candidates, target, ans, combine, 0);
        return ans;
    }

    private void dfs2(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }

        //下一层
        dfs2(candidates, target, ans, combine, idx + 1);

        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs2(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }
}
