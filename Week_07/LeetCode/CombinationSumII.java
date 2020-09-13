package LeetCode;

import java.util.*;

/**
 * LeetCode 每日一题
 * 40. 组合总和 II
 * 题目描述:
 *      给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *      candidates 中的每个数字在每个组合中只能使用一次。
 *      说明：
 *          所有数字（包括目标数）都是正整数。
 *          解集不能包含重复的组合。 
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/combination-sum-ii/solution/zu-he-zong-he-ii-by-leetcode-solution/
 *      方法一：递归
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       第1遍, 不理解, 没看懂抄了1遍
 */
public class CombinationSumII {
    List<int[]> freq = new ArrayList<int[]>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> sequence = new ArrayList<Integer>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int num : candidates) {
            int size = freq.size();
            if (freq.isEmpty() || num != freq.get(size - 1)[0]) {
                freq.add(new int[]{num, 1});
            } else {
                ++freq.get(size - 1)[1];
            }
        }
        dfs(0, target);
        return ans;
    }

    public void dfs(int pos, int rest) {
        if (rest == 0) {
            ans.add(new ArrayList<Integer>(sequence));
            return;
        }
        if (pos == freq.size() || rest < freq.get(pos)[0]) {
            return;
        }

        dfs(pos + 1, rest);

        int most = Math.min(rest / freq.get(pos)[0], freq.get(pos)[1]);
        for (int i = 1; i <= most; ++i) {
            sequence.add(freq.get(pos)[0]);
            dfs(pos + 1, rest - i * freq.get(pos)[0]);
        }
        for (int i = 1; i <= most; ++i) {
            sequence.remove(sequence.size() - 1);
        }
    }








    public List<List<Integer>> combinationSum3(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int num : candidates) {
            int size = freq.size();
            if (freq.isEmpty() || num != freq.get(size - 1)[0]) {
                freq.add(new int[]{num, 1});
            } else {
                ++ freq.get(size - 1)[1];
            }
        }
        dfs2(0, target);
        return ans;
    }

    private void dfs2(int pos, int rest) {
        if (rest == 0) {
            ans.add(new ArrayList<>(sequence));
            return;
        }
        if (pos == freq.size() || rest < freq.get(pos)[0]) return;

        dfs2(pos + 1, rest);

        int most = Math.min(rest / freq.get(pos)[0], freq.get(pos)[1]);
        for (int i = 1; i <= most; i++) {
            sequence.add(freq.get(pos)[0]);
            dfs2(pos + 1, rest - i * freq.get(pos)[0]);
        }
        for (int i = 1; i <= most; i++) {
            sequence.remove(sequence.size() - 1);
        }
    }
}
