package shuati;

import java.util.Stack;

/**
 * 32. 最长有效括号
 * 题目描述:
 *      给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/longest-valid-parentheses/solution/zui-chang-you-xiao-gua-hao-by-leetcode-solution/
 *          方法一：动态规划
 *          方法二：栈
 *          方法三：不需要额外的空间
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *          方法二：栈, 代码没理解, 但是不会写, 抄了一遍
 *
 */
public class LongestValidParentheses {


    /**
     * 方法二：栈
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(N)。
     *     空间复杂度：O(N)。
     *
     * 定义 maxans = 0
     * 定义 栈, 入栈 -1
     * 遍历 字符串s,
     *      如果s.charAt(i) == '(', 则入栈i;
     *      否则
     *          出栈
     *          如果栈为空,入栈i,否则取maxans, i - stack.peek()中最大值.
     */
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

    public int longestValidParentheses2(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                }else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

    public static void main(String[] args) {
        new LongestValidParentheses().longestValidParentheses(")()");
    }

}
