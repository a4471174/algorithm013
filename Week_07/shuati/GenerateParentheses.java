package shuati;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 22. 括号生成
 * 题目描述:
 *      数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/generate-parentheses/solution/gua-hao-sheng-cheng-by-leetcode-solution/
 *      方法一：暴力法
 *      方法二：回溯法
 *      方法三：按括号序列的长度递归
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：按括号序列的长度递归 : >不理解>理解, 第1遍, 能想到递归, 但是没有思路，抄了一遍。
 *
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        return generate(n);
    }


    List[] cache = new ArrayList[100];
    public List<String> generate(int n) {
        if (cache[n] != null) {
            return cache[n];
        }
        ArrayList<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generate(c))
                    for (String right: generate(n - 1 - c))
                        ans.add("(" + left + ")" + right);
        }
        cache[n] = ans;
        return ans;
    }


    public List<String> generate2(int n) {
        if ( cache[n] != null) {
            return cache[n];
        }
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");
        } else {
            for (int i = 0; i < n; i++) {
                for (String left : generate2(i)) {
                    for (String right : generate2(n - 1 - i)) {
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        cache[n] = ans;
        return ans;

    }






    public List<String> generateParenthesis2(int n) {
        List<String> ans = new LinkedList<>();
        backtrack(0, 0, n, "", ans);
        return ans;
    }

    public void backtrack(int left, int right, int n, String path, List<String> ans) {
        // 肯定不合法，提前结束
        if (left > n || left < right) {
            return;
        }
        // 到达结束条件
        if (left + right == 2 * n) {
            ans.add(path);
            return;
        }
        // 选择
        backtrack(left + 1, right, n, path + '(', ans);
        backtrack(left, right + 1, n, path + ')', ans);

    }

    /**
     * 方法: 递归
     *     1. 判断边界值, 无效的直接返回:
     *               左括号的数量 > 左右括号的数量,或者 左括号的数量 < 右括号的数量
     *
     *     2. 终止条件:
     *              若 左括号的数量 == n 并且 右括号的数量 == n,
     *              说明已正确使用括号数量, 则把 当前生成的括号字符串path 列表中
     *
     *     3. 下探
     *            a. 左括号的数量 + 1, 且 当前生成的括号字符串path + "("
     *            a. 右括号的数量 + 1, 且 当前生成的括号字符串path + ")"
     *
     * @param left  左括号的数量
     * @param right 右括号数量
     * @param n     左右括号的数量
     * @param path  当前生成的括号字符串
     * @param ans   符合条件生成的括号字符串列表
     */
    public void recursion(int left, int right, int n, String path, List<String> ans) {
        // 判断边界
        if (left > n || left < right) return;

        // 终止条件
        if (left == n && right == n) {
            ans.add(path);
            return;
        }
        // 选择
        recursion(left + 1, right, n, path + '(', ans);
        recursion(left, right + 1, n, path + ')', ans);
    }




    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }
}
