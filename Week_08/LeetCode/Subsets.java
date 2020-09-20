package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 78. 子集
 * 题目描述:
 *      给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *      说明：解集不能包含重复的子集。
 *
 * 题解:
 *      官方:https://leetcode-cn.com/problems/subsets/solution/zi-ji-by-leetcode-solution/
 *          方法一：迭代法实现子集枚举
 *          方法二：递归法实现子集枚举
 *
 *      powcai: https://leetcode-cn.com/problems/subsets/solution/hui-su-suan-fa-by-powcai-5/
 *          回溯算法
 *
 *      道法自然: https://leetcode-cn.com/problems/subsets/solution/er-jin-zhi-wei-zhu-ge-mei-ju-dfssan-chong-si-lu-9c/
 *          二进制和位运算
 *          循环枚举
 *          递归枚举
 *          DFS，前序遍历
 *          DFS，中序遍历
 *          DFS，后序遍历
 *          回溯
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *
 *     方法一：迭代法实现子集枚举, 不理解, 抄了一遍官方题解
 */
public class Subsets {


    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    /**
     *  方法一：迭代法实现子集枚举
     *  思路 参考LeeCode
     *  复杂度分析
     *       时间复杂度：O(n×2^n)
     *       空间复杂度：O(n)
     */
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }



}
