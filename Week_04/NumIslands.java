/**
 *
 *
 * 200. 岛屿数量
 * 题目描述:
 *     给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *     岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 *     此外，你可以假设该网格的四条边均被水包围。
 */
public class NumIslands {


    /**
     *  方法1: 深度优先搜索
     *      思路 参考LeeCode
     *      复杂度分析
     *          时间复杂度：O(MN)，其中 M 和 N 分别为行数和列数。
     *          空间复杂度：O(MN)，在最坏情况下，整个网格均为陆地，深度优先搜索的深度达到MN。
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }

    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }



    public int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int row_length = grid.length;
        int col_length = grid[0].length;
        int lands_num = 0;

        for (int r = 0; r < row_length; r++) {
            for (int c = 0; c < col_length; c++) {
                if (grid[r][c] == '1') {
                    ++lands_num;
                    dfs2(grid, r, c, row_length, col_length);
                }
            }
        }

        return lands_num;
    }

    void dfs2(char[][] grid, int r, int c, int row_length, int col_length) {
        if (r < 0 || c < 0 || r >= row_length || c >= col_length || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs2(grid, r - 1, c, row_length, col_length);
        dfs2(grid, r + 1, c, row_length, col_length);
        dfs2(grid, r, c - 1, row_length, col_length);
        dfs2(grid, r, c + 1, row_length, col_length);
    }

}
