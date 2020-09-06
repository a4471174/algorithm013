package shuati;

/**
 * 64. 最小路径和
 * 题目描述:
 *      给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      不理解
 */
public class MinPathSum {


    /**
     * 方法：动态规划
     *     思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(mn)，其中 m 和 n 分别是网格的行数和列数。需要对整个网格遍历一次，计算 dp 的每个元素的值。
     *     空间复杂度：O(mn)，其中 m 和 n 分别是网格的行数和列数。创建一个二维数组 dp，和网格大小相同。
     */
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length, columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < columns; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[rows - 1][columns - 1];
    }


    public int minPathSum2(int[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length; // 行数
        int cols = grid[0].length; // 列数

        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < rows; i++) { //求每行第1列 状态值
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < cols; i++) { //求每列第1行 状态值
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i -1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[rows - 1][cols - 1];

    }


    public int minPathSum3(int[][] grid) {

        //合法判断
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        // 行数、列数
        int rows = grid.length;
        int cols = grid[0].length;

        // 状态方程
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];


        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if(i==1)
                    dp[i][0] = dp[i - 1][0] + grid[i][0];
                else if(j==1)
                    dp[0][j] = dp[0][j - 1] + grid[0][j];
                else
                    dp[i][j] = Math.min(dp[i -1][j], dp[i][j - 1]) + grid[i][j];

            }
        }
        return dp[rows - 1][cols - 1];

    }


}
