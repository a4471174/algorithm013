package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 题目描述:
 *      给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *      你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
 *          方法一：暴力枚举
 *          方法二：哈希表
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：暴力枚举  理解
 *      方法二：哈希表    理解
 */
public class TwoSum {

    /**
     * 方法一：暴力枚举
     * 思路 参考LeeCode
     * 复杂度分析
     *      时间复杂度：O(n^2)
     *      空间复杂度：O(1)。
     */
    public int[] twoSum11(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return null;
    }


    /**
     * 方法二：哈希表
     * 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(n)
     *     空间复杂度：O(n)。
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference) )
                return new int[]{map.get(difference),i};
            map.put(nums[i], i);
        }
        return null;
    }
}
