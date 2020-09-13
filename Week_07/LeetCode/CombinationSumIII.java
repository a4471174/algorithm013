package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 每日一题
 * 216. 组合总和 III
 * 题目描述:
 *      找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 *      说明：
 *           所有数字都是正整数。
 *           解集不能包含重复的组合。 
 *
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/combination-sum-iii/solution/zu-he-zong-he-iii-by-leetcode-solution/
 *      方法一：二进制（子集）枚举
 *      方法二：组合枚举
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       二进制（子集）枚举: 第1遍, 不理解, 没看懂抄了1遍
 */
public class CombinationSumIII {

    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    /**
     * 方法一：二进制（子集）枚举
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(M×2^M)，其中 M 为集合的大小，本题中 MM 固定为 9。一共有 2^M个状态，每个状态需要 O(M + k) = O(M)O(M+k)=O(M) 的判断，故时间复杂度为O(M×2^M)。
     *      空间复杂度：O(M)。即 temp 的空间代价。
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        for (int mask = 0; mask < (1 << 9); ++mask) {
            if (check(mask, k, n)) {
                ans.add(new ArrayList<Integer>(temp));
            }
        }
        return ans;
    }

    public boolean check(int mask, int k, int n) {
        temp.clear();
        for (int i = 0; i < 9; ++i) {
            if (((1 << i) & mask) != 0) {
                temp.add(i + 1);
            }
        }
        if (temp.size() != k) {
            return false;
        }
        int sum = 0;
        for (int num : temp) {
            sum += num;
        }
        return sum == n;
    }











    public List<List<Integer>> combinationSum4(int k, int n) {
        for (int mask = 0; mask < (1 << 9); mask++) { // 这句话没看懂
            if (check2(mask, k, n)) {
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;

    }

    private boolean check2(int mask, int k, int n) {
        temp.clear();
        for (int i = 0; i < 9; i++) {
            if (((1 << i) & mask) !=0){
                temp.add(i + 1);
            }
        }
        if (temp.size() != k) {
            return  false;
        }
        int sum = 0;
        for (int num : temp) {
            sum += num;
        }
        return sum == n;
    }
}
