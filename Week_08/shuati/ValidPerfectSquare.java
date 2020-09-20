package shuati;

/**
 * 367. 有效的完全平方数
 * 题目描述:
 *      给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *      说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/valid-perfect-square/solution/you-xiao-de-wan-quan-ping-fang-shu-by-leetcode/
 *          方法一：二分查找
 *          方法二：牛顿迭代法
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法1: 二分查找： 理解, 写不出来, 抄了1遍
 *
 */
public class ValidPerfectSquare {


    /**
     *  方法1: 二分查找
     *  思路 参考LeeCode
     *  复杂度分析
     *       时间复杂度：O(logN)。
     *       空间复杂度：O(1)。
     */
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2, x, guessSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guessSquared = x * x;
            if (guessSquared == num) {
                return true;
            }
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare2(int num) {
        if (num == 1) return true;

        long left = 2;
        long right = num / 2;
        long mid;
        long guess;

        while (left <= right) {
            mid = (left + right) / 2;
            guess = mid * mid;
            if (guess == num) return true;
            if (guess > num) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return false;
    }

}
