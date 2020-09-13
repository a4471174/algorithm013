package LeetCode;

/**
 * LeetCode 每日一题
 * 79. 单词搜索
 * 题目描述:
 *      给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *      单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/word-search/solution/dan-ci-sou-suo-by-leetcode-solution/
 *      方法一：深度优先搜索
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       方法一：深度优先搜索: 理解, 第1遍, 能想到这种方式, 但是没有思路， 抄了一遍。
 */
public class WordSearch {

    /**
     * 方法一：深度优先搜索
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *      时间复杂度：时间复杂度：一个非常宽松的上界为O(MN⋅3^L)。
     *      空间复杂度：O(MN)。
     */
    public boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }



    public boolean exist2(char[][] board, String word) {
        //1. 获取二维网格 高、宽
        int height = board.length;
        int width = board[0].length;

        //2. 定义二维boolean数组visited,判断是否已访问
        boolean[][] visited = new boolean[height][width];

        //3. 遍历二维网格, 判断是否满足条件
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                boolean isExist = backtrack(board, visited, h, w, word, 0);
                if (isExist) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, boolean[][] visited, int h, int w, String word, int k) {
        //1. 终止条件:
        //  如果 当前网格所在位置 不等于 单词对应下标k的字母时,返回 false;
        //  如果 下标k 等于 单词长度-1, 返回 true;
        if (board[h][w] != word.charAt(k)) {
            return false;
        } else if (k == word.length() -1) {
            return true;
        }

        //2. 回溯状态 置为 true
        visited[h][w] = true;

        //3. 处理逻辑
        // 定义4个方向:  directions {0, 1}, {0, -1}, {1,0}, {-1,0}
        //            {0, 1}  表示  右移一格
        //            {0,-1}  表示  左移一格
        //            {1, 0}  表示  上移一格
        //            {-1,0}  表示  下移一格
        // 遍历当前网格所在位置的4个方向
        //      如果没有访问过, 继续下探进行判断。
        //      若下探返回true, 跳出循环体.
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] direction : directions) {
            int newh = h + direction[0];
            int neww = w + direction[1];
            if (newh >= 0 && newh < board.length && neww >= 0 && neww < board[0].length) {
                if (!visited[newh][neww]) {
                    boolean isExist = backtrack(board, visited, newh, neww, word, k + 1);
                    if (isExist) {
                        result = true;
                        break;
                    }
                }
            }
        }
        //回溯状态 置为 false
        visited[h][w] = false;

        return result;
    }



}
