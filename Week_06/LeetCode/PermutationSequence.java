package LeetCode;


import java.util.Arrays;

/**
 * LeetCode 每日一题
 *
 * 60. 第k个排列
 * 题目描述:
 *      给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 *      按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 *          "123"
 *          "132"
 *          "213"
 *          "231"
 *          "312"
 *          "321"
 *      给定 n 和 k，返回第 k 个排列。
 *
 *      说明：
 *      给定 n 的范围是 [1, 9]。
 *      给定 k 的范围是[1,  n!]。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/permutation-sequence/solution/di-kge-pai-lie-by-leetcode-solution/
 *      方法一：数学 + 缩小问题规模
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *    不理解
 */
public class PermutationSequence {


    /**
     * 方法: 数学 + 缩小问题规模
     * 思路 参考
     * 复杂度分析：
     *     时间复杂度：O(N^2)
     *     空间复杂度：O(N)
     */
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; ++i) {
            factorial[i] = factorial[i - 1] * i;
        }

        --k;
        StringBuffer ans = new StringBuffer();
        int[] valid = new int[n + 1];
        Arrays.fill(valid, 1);
        for (int i = 1; i <= n; ++i) {
            int order = k / factorial[n - i] + 1;
            for (int j = 1; j <= n; ++j) {
                order -= valid[j];
                if (order == 0) {
                    ans.append(j);
                    valid[j] = 0;
                    break;
                }
            }
            k %= factorial[n - i];
        }
        return ans.toString();
    }
}
