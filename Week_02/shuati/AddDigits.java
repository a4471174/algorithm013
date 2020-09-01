package shuati;

/**
 *
 *
 * 题目描述:
 *      258. 各位相加
 *          给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 */
public class AddDigits {

    /**
     *  方法1: 模拟法
     *      思路:
     *
     *      算法:
     *      复杂度分析:
     *          时间复杂度: O(1)
     *          空间复杂度: O(1)
     */
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

}
