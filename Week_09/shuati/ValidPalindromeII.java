package shuati;


/**
 * 680. 验证回文字符串 Ⅱ
 * 题目描述:
 *      给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 题解:
 *      官方:https://leetcode-cn.com/problems/path-sum-ii/solution/lu-jing-zong-he-ii-by-leetcode-solution/
 *          方法一：贪心算法
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *     方法一：贪心算法, 不理解
 *
 */
public class ValidPalindromeII {

    /**
     * 方法一：贪心算法
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(N)。
     *     空间复杂度：O(1)。
     */
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                low++;
                high--;
            } else {
                boolean flag1 = true, flag2 = true;
                for (int i = low, j = high - 1; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag1 = false;
                        break;
                    }
                }
                for (int i = low + 1, j = high; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }

}
