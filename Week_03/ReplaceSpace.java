
/**
 *
 *
 * 题目描述:
 *      给定一个二叉树，返回它的中序 遍历。
 *
 *
 */
public class ReplaceSpace {

    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    /**
     *  方法1: 递归
     *      思路
     *          参考LeeCode
     *
     *      复杂度分析
     *          时间复杂度：O(n)。遍历字符串 s 一遍。
     *          空间复杂度：O(n)。额外创建字符数组，长度为 s 的长度的 3 倍。
     *
     */
    public String replaceSpace2(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }


}
