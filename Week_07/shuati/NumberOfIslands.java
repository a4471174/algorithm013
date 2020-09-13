package shuati;

/**
 *
 *
 * 200. 岛屿数量
 * 题目描述:
 *     给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *     岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 *     此外，你可以假设该网格的四条边均被水包围。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-shu-liang-by-leetcode/
 *          方法一：深度优先搜索
 *          方法二：广度优先搜索
 *          方法三：并查集
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *     深度优先搜索: 理解。      知道需要dfs, 但是忘了思路，又抄了一遍。 加深理解。
 */
public class NumberOfIslands {


    /**
     *  方法1: 深度优先搜索
     *      思路 参考LeeCode
     *      复杂度分析
     *          时间复杂度：O(MN)，其中 M 和 N 分别为行数和列数。
     *          空间复杂度：O(MN)，在最坏情况下，整个网格均为陆地，深度优先搜索的深度达到MN。
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int row_length = grid.length;
        int col_length = grid[0].length;
        int lands_num = 0;

        for (int r = 0; r < row_length; r++) {
            for (int c = 0; c < col_length; c++) {
                if (grid[r][c] == '1') {
                    ++lands_num;
                    dfs(grid, r, c, row_length, col_length);
                }
            }
        }

        return lands_num;
    }

    void dfs(char[][] grid, int r, int c, int row_length, int col_length) {
        if (r < 0 || c < 0 || r >= row_length || c >= col_length || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c, row_length, col_length);
        dfs(grid, r + 1, c, row_length, col_length);
        dfs(grid, r, c - 1, row_length, col_length);
        dfs(grid, r, c + 1, row_length, col_length);
    }


    /**
     *  方法1: 深度优先搜索
     *      思路
     *          1. 判断边界值合法性
     *          2. 初始化: 行数、列数、岛屿数
     *          3. 遍历 二维网格
     *              a. 当grid[r][c] == '1'时, 说明遇到岛屿.
     *              b. 岛屿数量 +1
     *              c. 通过深度遍历(dfs), 把所有与此相邻的都标记为0.
     *          4. 返回岛屿数量
     *      复杂度分析
     *          时间复杂度：O(MN)，其中 M 和 N 分别为行数和列数。
     *          空间复杂度：O(MN)，在最坏情况下，整个网格均为陆地，深度优先搜索的深度达到MN。
     */
    public int numIslands2(char[][] grid) {
        //1. 判断边界值合法性
        if (grid == null || grid.length == 0) return 0;

        //2. 初始化: 行数、列数、岛屿数
        int row_length = grid.length;
        int col_length = grid[0].length;
        int lands_num = 0;

        //3. 遍历 二维网格
        for (int r = 0; r < row_length; r++) {
            for (int c = 0; c < col_length; c++) {
                if (grid[r][c] == '1') { //当grid[r][c] == '1'时, 说明遇到岛屿.
                    lands_num++;  // 岛屿数量 +1
                    dfs2(grid, r, c, row_length, col_length); // 通过深度遍历(dfs), 把所有与此相邻的都标记出来
                }
            }
        }

        //4. 返回岛屿数量
        return lands_num;
    }

    /**
     *  深度遍历实现:
     *      1. 终止条件:  r < 0 || c < 0 || r >= row_length || c >= col_length 或者 grid[r][c] 为 '0'
     *      2. 处理逻辑:  grid[r][c] = '0'
     *      3. 下探:
     *          a. 上移一行, 列不变
     *          b. 下移一行, 列不变
     *          c. 行不变, 左移一列
     *          d. 行不变, 右移一列
     *
     * @param grid  二维网格
     * @param r 行下标
     * @param c 列下标
     * @param row_length 行数
     * @param col_length 列数
     */
    private void dfs2(char[][] grid, int r, int c, int row_length, int col_length) {
        //1. 终止条件:   r < 0 || c < 0 || r >= row_length || c >= col_length 或者 grid[r][c] 为 '0'
        if ((r < 0 || c < 0 || r >= row_length || c >= col_length) || grid[r][c] == '0') {
            return;
        }

        //2. 处理逻辑
        grid[r][c] = '0';

        //3. 下探
        dfs2(grid, r - 1, c, row_length, col_length); //上移一行, 列不变
        dfs2(grid, r + 1, c, row_length, col_length); //下移一行, 列不变
        dfs2(grid, r ,c - 1, row_length, col_length); //行不变, 左移一列
        dfs2(grid, r ,c + 1, row_length, col_length); //行不变, 右移一列

    }

}
