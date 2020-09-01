package shuati;

/**
 * 53. 最大子序和
 * 题目描述:
 *      给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaxSubArray {

    /**
     * 方法: 暴力求解 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(N^2)
     *     空间复杂度：O(1)
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public int maxSubArray3(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if((sum+=nums[j])>max){
                    max = sum;
                }
            }
        }
        return  max;
    }


    /**
     * 方法:动态规划 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(n)，其中 n 为 nums 数组的长度。我们只需要遍历一遍数组即可求得答案。
     *     空间复杂度：O(1)。我们只需要常数空间存放若干变量。
     */
    public int maxSubArray2(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre +nums[i] ,nums[i]);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


}
