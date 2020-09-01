package shuati;

import java.util.HashMap;
import java.util.Map;

/**
 * 1143. 最长公共子序列
 * 题目描述:
 *      给定两个字符串 text1 和 text2，返回这两个字符串的最长公共子序列的长度。
 *
 *      一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
 *      例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。
 *
 *      若这两个字符串没有公共子序列，则返回 0。
 *
 */
public class LongestCommonSubsequence {

    /**
     *
     * 方法: 暴力求解 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(m * n)O(m∗n)，其中 m 和 n 分别为 A 和 B 的 长度。
     *     空间复杂度：O(m * n)O(m∗n)，其中 m 和 n 分别为 A 和 B 的 长度。
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 获取两个串字符
                char c1 = text1.charAt(i), c2 = text2.charAt(j);
                if (c1 == c2) {
                    // 去找它们前面各退一格的值加1即可
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    //要么是text1往前退一格，要么是text2往前退一格，两个的最大值
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[m][n];
    }



    public int longestCommonSubsequence3(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i < m; i++) {

            char text1_c = text1.charAt(i);
            for (int j = 0; j < n; j++) {

                char text2_c = text2.charAt(j);

                if (text1_c==text2_c) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[m][n];
    }
}
