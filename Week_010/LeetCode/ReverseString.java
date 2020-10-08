package LeetCode;

/**
 * 344. 反转字符串
 * 题目描述:
 *    编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *    不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *    你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/reverse-string/solution/fan-zhuan-zi-fu-chuan-by-leetcode-solution/
 *          方法一：双指针
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：双指针
 */
public class ReverseString {

    public void reverseString(char[] s) {
        if (s == null) return ;

        int left = 0;
        int right = s.length - 1;
        while (left < right) {

            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }

    }


    /**
     * 方法一：双指针
     * 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(n)
     *     空间复杂度：O(1)。
     */
    public void reverseString2(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

}
