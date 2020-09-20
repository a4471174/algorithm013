package LeetCode;


import java.util.ArrayList;
import java.util.List;

/**
 * 37. 解数独
 * 题目描述:
 *      编写一个程序，通过已填充的空格来解决数独问题。
 *      一个数独的解法需遵循如下规则：
 *      数字 1-9 在每一行只能出现一次。
 *      数字 1-9 在每一列只能出现一次。
 *      数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *      空白格用 '.' 表示。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/sudoku-solver/solution/jie-shu-du-by-leetcode-solution/
 *          方法一：递归(深度优先搜索 + 回溯)
 *          方法二：位运算优化
 *          方法三：枚举优化
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法1: 递归： >不理解>理解, 写不出来, 抄了1遍
 *
 */
public class JieShuDuByLeetcodeSolution {


    private boolean[][] line = new boolean[9][9];       //行
    private boolean[][] column = new boolean[9][9];     //列
    private boolean[][][] block = new boolean[3][3][9]; //块
    private boolean valid = false; //有效标志位
    private List<int[]> spaces = new ArrayList<>();     //空白格列表

    /**
     *  方法1: 递归
     *  思路 参考LeeCode
     *  复杂度分析
     *          较为宽松的渐进复杂度上界 O(9^9×9)
     *
     *  遍历数独board
     *      如果 数独board[i][j] == '.', 空白格列表spaces记录该i,j
     *      否则 digit = board[i][j] - '0' - 1; 行\列\块 标记
     *  深度优先搜索
     *      终止条件: pos等于空白格列表大小
     *      处理逻辑
     *          取空白格
     *          遍历1~9,从中判断是否含有行块列
     *              回溯状态置为 true
     *              下探一层
     *              回溯状态置为 false
     */
    public void solveSudoku(char[][] board) {
        //遍历数独board
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                //如果 数独board[i][j] == '.', 空白格列表spaces记录该i,j
                // 否则 digit = board[i][j] - '0' - 1; 行\列\块 标记
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                } else {
                    int digit = board[i][j] - '0' - 1; //没搞明白
                    line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                }
            }
        }
        //深度优先搜索
        dfs(board, 0);
    }

    public void dfs(char[][] board, int pos) {
        //终止条件: pos等于空白格列表大小
        if (pos == spaces.size()) {
            valid = true;
            return;
        }
        //  取空白格
        int[] space = spaces.get(pos);
        int i = space[0], j = space[1];
        // 遍历1~9,从中判断是否含有行块列
        for (int digit = 0; digit < 9 && !valid; ++digit) {
            if (!line[i][digit] && !column[j][digit] && !block[i / 3][j / 3][digit]) {
                //回溯状态置为 true
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                //下探
                board[i][j] = (char) (digit + '0' + 1);
                dfs(board, pos + 1);
                //回溯状态置为 false
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = false;
            }
        }
    }


    public static void main(String[] args) {
        //int digit = board[i][j] - '0' - 1; //没搞明白
        //int digit = 1 - '0' - 1;
        //System.out.println(digit);
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        int digit = board[0][0] - '0' - 1; //没搞明白
        //int digit = 1 - '0' - 1;
        System.out.println(digit);
        for (int digit1 = 0; digit1 < 9 ; ++digit1) {
            int board_val = (char) (digit1 + '0' + 1);
            System.out.println(digit1 + "___" +board_val);
        }


        JieShuDuByLeetcodeSolution jie = new JieShuDuByLeetcodeSolution();
        jie.solveSudoku(board);
    }

}


