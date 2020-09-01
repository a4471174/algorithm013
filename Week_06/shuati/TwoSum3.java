package shuati;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * 1. 两数之和
 * 题目描述:
 *      给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 */
public class TwoSum3 {

    /**
     * 方法1: 暴力法
     *     思路 参考LeeCode 两层for循环
     * 复杂度分析
     *     时间复杂度：O(n^2)
     *     空间复杂度：O(1)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 方法2：两遍哈希表
     *     思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(n)
     *     空间复杂度：O(n)
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference) && map.get(difference)!=i) {
                return new int[]{i,map.get(difference)};
            }
        }
        return null;
    }

    /**
     * 方法3：一遍哈希表
     *     思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(n)
     *     空间复杂度：O(n)
     */
    public int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference)!=i) {
                return new int[]{i, map.get(difference)};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}
