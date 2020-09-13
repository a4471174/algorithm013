package shuati;


/**
 * 347. 前 K 个高频元素
 * 题目描述:
 *      给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/top-k-frequent-elements/solution/qian-k-ge-gao-pin-yuan-su-by-leetcode-solution/
 *          方法一：堆
 *          方法二：基于快速排序
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：堆 理解, 抄了1遍
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
