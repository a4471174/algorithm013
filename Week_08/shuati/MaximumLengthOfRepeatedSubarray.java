package shuati;

/**
 * 718. 最长重复子数组
 * 题目描述:
 *      给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/solution/zui-chang-zhong-fu-zi-shu-zu-by-leetcode-solution/
 *          暴力解法
 *          方法一：动态规划
 *          方法二：滑动窗口
 *          方法三：二分查找 + 哈希
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *          方法一：动态规划, 理解, 抄了一遍官方题解
 *
 */
public class MaximumLengthOfRepeatedSubarray {

    /**
     * 暴力解法 超时间限制
     */
    public int findLength(int[] A, int[] B) {
        int nums = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int k = 0;
                while ( i+k < A.length && j+k < A.length && A[i + k]==B[j + k] ){
                    k++;
                }
                nums = Math.max(k,nums);
            }
        }
        return nums;
    }


    /**
     *  方法一：动态规划
     *  思路 参考LeeCode
     *  复杂度分析
     *       时间复杂度： O(N×M)
     *       空间复杂度： O(N×M)
     */
    public int findLength2(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }



}
