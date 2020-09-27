package shuati;

/**
 * 541. 反转字符串 II
 * 题目描述:
 *      给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 *      如果剩余字符少于 k 个，则将剩余字符全部反转。
 *      如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 题解:
 *      dqf18620: https://leetcode-cn.com/problems/reverse-string-ii/solution/fan-zhuan-zi-fu-chuan-ii-by-leetcode/
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *
 *
 */
public class ReverseStringII {


    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        for(int i = 0; i < s.length(); i += 2 * k) {
            int l = i, r = Math.min(i + k - 1, str.length - 1);
            reverse(str, l, r);
        }
        return new String(str);
    }

    public void reverse(char[] str, int l, int r) {
        while(l <= r) {
            char tmp = str[l];
            str[l] = str[r];
            str[r] = tmp;
            l++;
            r--;
        }
    }
}
