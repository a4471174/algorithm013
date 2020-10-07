package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. 宝石与石头
 * 题目描述:
 *       给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *       J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 题解:
 *      官网: https://leetcode-cn.com/problems/jewels-and-stones/solution/bao-shi-yu-shi-tou-by-leetcode-solution/
 *          方法一：暴力
 *          方法二：哈希集合
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：暴力      理解, 没写出来
 *      方法二：哈希集合   理解, 没写出来
 */
public class JewelsAndStones {

    /**
     * 方法一：暴力
     * 思路 参考LeeCode 官网
     * 复杂度分析
     *     时间复杂度：O(mn)。
     *     空间复杂度：O(1)。
     */
    public int numJewelsInStones(String J, String S) {
        int jewelsCount = 0;
        int jewelsLength = J.length(), stonesLength = S.length();
        for (int i = 0; i < stonesLength; i++) {
            char stone = S.charAt(i);
            for (int j = 0; j < jewelsLength; j++) {
                char jewel = J.charAt(j);
                if (stone == jewel) {
                    jewelsCount++;
                    break;
                }
            }
        }
        return jewelsCount;
    }

    /**
     * 方法二：哈希集合
     * 思路 参考LeeCode 官网
     * 复杂度分析
     *     时间复杂度：O(m+n)。
     *     空间复杂度：O(m)。
     */
    public int numJewelsInStones2(String J, String S) {
        int jewelsCount = 0;
        Set<Character> jewelsSet = new HashSet<Character>();
        int jewelsLength = J.length(), stonesLength = S.length();
        for (int i = 0; i < jewelsLength; i++) {
            char jewel = J.charAt(i);
            jewelsSet.add(jewel);
        }
        for (int i = 0; i < stonesLength; i++) {
            char stone = S.charAt(i);
            if (jewelsSet.contains(stone)) {
                jewelsCount++;
            }
        }
        return jewelsCount;
    }


}
