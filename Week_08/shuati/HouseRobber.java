package shuati;

/**
 * 198. 打家劫舍
 * 题目描述:
 *      你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *      给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/reverse-bits/solution/dian-dao-er-jin-zhi-wei-by-leetcode/
 *      方法一：动态规划 + 滚动数组
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       方法一：动态规划 + 滚动数组 , 理解, 自己没想出来.
 *
 */
public class HouseRobber {


    /**
     * 方法一：动态规划 + 滚动数组
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(n)。
     *     空间复杂度：O(1)。
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }

}
