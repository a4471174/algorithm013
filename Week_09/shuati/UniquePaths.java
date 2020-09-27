package shuati;

import java.util.Arrays;

/**
 * 62. 不同路径
 * 题目描述:
 *      一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *      机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *      问总共有多少条不同的路径？
 *
 *
 * 题解:
 *      powcai: https://leetcode-cn.com/problems/unique-paths/solution/dong-tai-gui-hua-by-powcai-2/
 *          思路一：排列组合
 *          思路二：动态规划
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      思路二：动态规划, 理解, 想到了动态规划,但是没想到怎么定义状态方程
 *
 */
public class UniquePaths {

    /**
     * 方法一：递归
     * 思路 参考LeeCode powcai
     * 复杂度分析
     *     时间复杂度：O(m∗n)。
     *     空间复杂度：O(m∗n)。
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }


    public int uniquePaths2(int m, int n) {
        int[] pre = new int[n];
        int[] cur = new int[n];
        Arrays.fill(pre, 1);
        Arrays.fill(cur,1);
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                cur[j] = cur[j-1] + pre[j];
            }
            pre = cur.clone();
        }
        return pre[n-1];
    }

}
