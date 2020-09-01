package shuati;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 * 题目描述:
 *      写一个程序，输出从 1 到 n 数字的字符串表示。
 *      1. 如果 n 是3的倍数，输出“Fizz”；
 *      2. 如果 n 是5的倍数，输出“Buzz”；
 *      3.如果 n 同时是3和5的倍数，输出 “shuati.FizzBuzz”。
 *
 */
public class FizzBuzz {

    /**
     *  方法1: 模拟法
     *      思路:
     *          for循环
     *      算法:
     *      复杂度分析:
     *          时间复杂度: O(n)
     *          空间复杂度: O(1)
     */
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (i%3==0 && i%5==0) {
                res.add("shuati.FizzBuzz");
                continue;
            } else if (i%3==0) {
                res.add("Fizz");
                continue;
            } else if (i%5==0) {
                res.add("Buzz");
                continue;
            } else {
                res.add(i+"");
            }

        }
        return res;
    }

    /**
     *  方法2： 字符串连接
     *     思路:
     *     算法:
     *     复杂度分析
     *         时间复杂度： O(N)
     *         空间复杂度： O(1)
     */
    public List<String> fizzBuzz2(int n) {
        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            String numAnsStr = "";

            if (divisibleBy3) {
                // Divides by 3, add Fizz
                numAnsStr += "Fizz";
            }

            if (divisibleBy5) {
                // Divides by 5, add Buzz
                numAnsStr += "Buzz";
            }

            if (numAnsStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                numAnsStr += Integer.toString(num);
            }

            // Append the current answer str to the ans list
            ans.add(numAnsStr);
        }

        return ans;
    }

    /**
     *  方法3 用散列表
     *     思路:
     *     算法:
     *     复杂度分析
     *         时间复杂度： O(N)
     *         空间复杂度： O(1)
     */
    public List<String> fizzBuzz3(int n) {

        // ans list
        List<String> ans = new ArrayList<String>();

        // Hash map to store all fizzbuzz mappings.
        Map<Integer, String> fizzBizzDict =
                new HashMap<Integer, String>() {
                    {
                        put(3, "Fizz");
                        put(5, "Buzz");
                    }
                };

        for (int num = 1; num <= n; num++) {

            String numAnsStr = "";

            for (Integer key : fizzBizzDict.keySet()) {

                // If the num is divisible by key,
                // then add the corresponding string mapping to current numAnsStr
                if (num % key == 0) {
                    numAnsStr += fizzBizzDict.get(key);
                }
            }

            if (numAnsStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                numAnsStr += Integer.toString(num);
            }

            // Append the current answer str to the ans list
            ans.add(numAnsStr);
        }

        return ans;
    }



    /**
     *
     * 方法4 重写get和size方法
     *    思路:
     *    算法:
     *    复杂度分析
     *        时间复杂度： O(1)
     *        空间复杂度： O(1)
     */
    public List<String> fizzBuzz4(int n) {
        return (List<String>) new java.util.AbstractList<String>() {
            public String get(int i) {
                ++i;
                switch((i%3==0?1:0)+(i%5==0?2:0)){
                    case 0:return String.valueOf(i);
                    case 1:return "Fizz";
                    case 2:return "Buzz";
                    case 3:return "shuati.FizzBuzz";
                }
                return "";
            }
            public int size() {
                return n;
            }
        };
    }
}
