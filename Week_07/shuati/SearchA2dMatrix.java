package shuati;


/**
 * 74. 搜索二维矩阵
 * 题目描述:
 *      编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *      每行中的整数从左到右按升序排列。
 *      每行的第一个整数大于前一行的最后一个整数。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/search-a-2d-matrix/solution/sou-suo-er-wei-ju-zhen-by-leetcode/
 *          方法：二分查找
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法：二分查找: >不理解>理解, 抄了1遍
 *
 */
public class SearchA2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        // 二分查找
        int left = 0, right = m * n - 1;
        int pivotIdx, pivotElement;
        while (left <= right) {
            pivotIdx = (left + right) / 2;
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            if (target == pivotElement) return true;
            else {
                if (target < pivotElement) right = pivotIdx - 1;
                else left = pivotIdx + 1;
            }
        }
        return false;
    }

}
