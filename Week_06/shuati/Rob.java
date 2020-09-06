package shuati;


import java.util.Arrays;

/**
 * 213. 打家劫舍 II
 * 题目描述:
 *     你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。
 *     同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *     给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 题解:
 *     Krahets: https://leetcode-cn.com/problems/house-robber-ii/solution/213-da-jia-jie-she-iidong-tai-gui-hua-jie-gou-hua-/
 *        动态规划
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       不理解
 */
public class Rob {

    /**
     * 方法: 动态规划
     * 思路  参考LeeCode Krahets
     * 复杂度分析：
     *     时间复杂度 O(N) ： 两次遍历 nums 需要线性时间；
     *     空间复杂度 O(1)： cur和 pre 使用常数大小的额外空间。
     */
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }
    private int myRob(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for(int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }


    public int rob2(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(myRob2(Arrays.copyOfRange(nums, 0, nums.length-1)),
                myRob2(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int myRob2(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for (int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }

    public int rob3(int[] nums){
        if (nums.length == 0) return  0;
        if (nums.length == 1) return nums[0];
        return Math.max(myRob3(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob3(Arrays.copyOfRange(nums,1, nums.length)));
    }

    private int myRob3(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for (int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }

}
