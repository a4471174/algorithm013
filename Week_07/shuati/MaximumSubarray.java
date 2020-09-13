package shuati;

/**
 * 53. 最大子序和
 * 题目描述:
 *     给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/maximum-subarray/solution/zui-da-zi-xu-he-by-leetcode-solution/
 *          方法一：动态规划
 *          方法二：分治
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      暴力算法:  理解
 *      动态规划:  >理解>不理解, 忘记了又抄了1遍
 */
public class MaximumSubarray {


    /**
     *  方法1: 暴力算法
     *      思路
     *          两层for循环:
     *              第一层循环: 子序列个数.
     *              第二层循环: 子序列长度,计算每个子序列最大和
     *          返回子序列最大和
     *      复杂度分析
     *          时间复杂度：O(n^2)
     *          空间复杂度：O(1)
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if ((sum+=nums[j])>max){
                    max = sum;
                }
            }
        }
        return max;
    }


    /**
     * 方法2: 动态规划
     * 思路 参考LeeCode 官方
     * 复杂度
     *  时间复杂度：O(n)，其中 n 为 nums 数组的长度。我们只需要遍历一遍数组即可求得答案。
     *  空间复杂度：O(1)。我们只需要常数空间存放若干变量。
     */
    public int maxSubArray12(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre +nums[i] ,nums[i]);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    /**
     * 方法2: 动态规划
     * 思路 参考LeeCode 明夕灬何夕
     * 复杂度
     *  时间复杂度：O(n)，其中 n 为 nums 数组的长度。我们只需要遍历一遍数组即可求得答案。
     *  空间复杂度：O(1)。我们只需要常数空间存放若干变量。
     */
    public int maxSubArray13(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        //定义dp数组，dp数组中的每个值dp[i]代表着以nums[i]为结尾的最大子序和
        int[] dp = new int[n];
        //以nums[0]结尾的最大子序和就是nums[0]
        dp[0] = nums[0];
        //遍历，通过状态转移方程求得dp[i]的最大子序和
        for(int i = 1; i < n; ++i){
            //dp[i]的最大子序和要么是自成一派最大，要么就是当前值加上前面i - 1个数的最大子序和
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }

        //遍历dp数组，求得dp数组中的最大值，就是该题的答案
        int res = Integer.MIN_VALUE;
        for(int j = 0; j < dp.length; ++j){
            res = Math.max(res, dp[j]);
        }
        return res;
    }
}
