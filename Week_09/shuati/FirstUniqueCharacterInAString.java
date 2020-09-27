package shuati;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. 字符串中的第一个唯一字符
 * 题目描述:
 *      给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/first-unique-character-in-a-string/solution/zi-fu-chuan-zhong-de-di-yi-ge-wei-yi-zi-fu-by-leet/
 *          方法一： 线性时间复杂度解法
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一： 线性时间复杂度解法, 理解, 但是没做出来,参考了官方
 *
 */
public class FirstUniqueCharacterInAString {


    /**
     * 方法一： 线性时间复杂度解法
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(N)。
     *     空间复杂度：O(N)。
     *
     *  1. 统计单词中每个字母次数.
     *  2. 按单词的字母顺序获取字母次数为0的索引。若存在,则返回该索引。
     *  3. 其他情况返回-1
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }


    public int firstUniqChar2(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }





    public static void main(String[] args) {
        new FirstUniqueCharacterInAString().firstUniqChar("cc");
    }
}
