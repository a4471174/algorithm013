package shuati;

import java.util.List;

/**
 * 120. 三角形最小路径和
 * 题目描述:
 *      给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *      相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 *
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/triangle/solution/san-jiao-xing-zui-xiao-lu-jing-he-by-leetcode-solu/
 *          方法一：动态规划
 *          方法二：动态规划 + 空间优化
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：动态规划,  不理解, 循环体没看懂.
 */
public class Triangle {


    /**
     * 方法一：动态规划
     * 思路 参考LeeCode 官网
     * 复杂度分析
     *     时间复杂度：O(n^2)。
     *     空间复杂度：O(n^2)。
     *
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            f[i][0] = f[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; ++j) {
                f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i).get(j);
            }
            f[i][i] = f[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = f[n - 1][0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[n - 1][i]);
        }
        return minTotal;
    }


    public int minimumTotal2(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < size; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = dp[size - 1][0];
        for (int i = 1; i < size; i++) {
            minTotal = Math.min(minTotal, dp[size - 1][i]);
        }
        return minTotal;
    }

}
