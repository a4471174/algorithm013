package shuati;

/**
 * 190. 颠倒二进制位
 * 题目描述:
 *      颠倒给定的 32 位无符号整数的二进制位。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/reverse-bits/solution/dian-dao-er-jin-zhi-wei-by-leetcode/
 *      方法一：逐位颠倒
 *      方法二：带记忆化的按字节颠倒
 *      方法三：

 *      artecy: https://leetcode-cn.com/problems/reverse-bits/solution/zhi-qi-ran-zhi-qi-suo-yi-ran-wei-yun-suan-jie-fa-x/
 *      解法1 取模求和
 *      解法2 按位翻转
 *      解法3:分治合并
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      解法1 取模求和,  不理解, 抄了1遍
 *
 */
public class ReverseBits {


    // you need treat n as an unsigned value

    /**
     * 解法1 取模求和
     * 思路 参考LeeCode artecy
     * 复杂度分析
     *     时间复杂度：O(n^2)，整个矩阵都要被遍历，大小为 n^2。
     *     空间复杂度：O(n)，visitedvisited 数组的大小。
     */
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }


    public int reverseBits2(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return  res;
    }
}
