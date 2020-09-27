package shuati;

/**
 * 300. 最长上升子序列
 * 题目描述:
 *      给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/longest-increasing-subsequence/solution/zui-chang-shang-sheng-zi-xu-lie-by-leetcode-soluti/
 *          方法一：动态规划
 *          方法二：贪心 + 二分查找
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：动态规划, >不理解>理解, 没思路,看官网,抄了一遍
 *
 */
public class LongestIncreasingSubsequence {


    /**
     * 方法一：动态规划
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(n^2)。
     *     空间复杂度：O(n)。
     */
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }


    public int lengthOfLIS2(int[] nums) {
        //边界判断
        if (nums.length == 0) {
            return 0;
        }
        //状态方程
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans,dp[i]);
        }
        return maxans;
    }

}
