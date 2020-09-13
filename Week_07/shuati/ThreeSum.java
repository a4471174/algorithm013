package shuati;

import java.util.ArrayList;
import java.util.Arrays;
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
 *      官方: https://leetcode-cn.com/problems/3sum/solution/san-shu-zhi-he-by-leetcode-solution/
 *      方法一：排序 + 双指针
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       排序 + 双指针: 第1遍, 不理解, 没看懂抄了1遍
 */
public class ThreeSum {


    /**
     * 方法一：排序 + 双指针
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：O(N^2)。
     *      空间复杂度：O(logN)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

}
