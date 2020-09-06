package shuati;

/**
 * 剑指 Offer 05. 替换空格
 * 题目描述:
 *      请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      理解
 */
public class ReplaceSpace2 {


    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }


    /**
     * 思路 参考LeeCode
     * 复杂性分析
     *     时间复杂度：O(n)。遍历字符串 s 一遍。
     *     空间复杂度：O(n)。额外创建字符数组，长度为 s 的长度的 3 倍。
     */
    public String replaceSpace2(String s) {
        int length = s.length();
        char[] array = new char[length *3];
        int size = 0;
        for (int i=0; i<length; i++) {
            char c = s.charAt(i);
            if (c==' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        return new String(array, 0, size);
    }
}
