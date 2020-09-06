package shuati;

import java.util.Arrays;

/**
 * 322. 零钱兑换
 * 题目描述:
 *     给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 *
 * 题解:
 *     官方: https://leetcode-cn.com/problems/coin-change/solution/322-ling-qian-dui-huan-by-leetcode-solution/
 *          方法一、搜索回溯 [超出时间限制]
 *          方法二、动态规划-自上而下 [通过]
 *          方法三、动态规划：自下而上 [通过]
 *
 *     Ikaruga: https://leetcode-cn.com/problems/coin-change/solution/322-by-ikaruga/
 *          贪心 + dfs
 *
 *     sugar: https://leetcode-cn.com/problems/coin-change/solution/javadi-gui-ji-yi-hua-sou-suo-dong-tai-gui-hua-by-s/
 *          Java 递归、记忆化搜索、动态规划
 *
 *  理解程度(不理解\理解\掌握\熟练\精通):
 *      理解
 *      照抄1遍
 */
public class CoinChange {


    /**
     * 方法 贪心 + dfs
     * 思路 参考 LeeCode Ikaruga
     * 复杂度分析
     *     时间复杂度：
     *     空间复杂度：
     */
    int res = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount){
        if(amount==0){
            return 0;
        }
        Arrays.sort(coins);
        mincoin(coins,amount,coins.length-1,0);
        return res==Integer.MAX_VALUE? -1:res;
    }
    private void mincoin(int[] coins,int amount, int index, int count){
        if(amount==0){
            res = Math.min(res,count);
            return;
        }
        if(index<0){
            return;
        }
        for(int i = amount/coins[index];i>=0 && i+count<res; i--){
            mincoin(coins,amount - (i*coins[index]), index-1, count+i);
        }
    }

    public int coinChange2(int[] coins, int amount){
        if (amount == 0) return 0;

        Arrays.sort(coins);

        mincoin2(coins,amount,coins.length-1,0);

        return  res == Integer.MAX_VALUE? -1 : res;
    }

    private void mincoin2(int[] coins, int amount, int idx, int count) {
        if (amount == 0) {
            res = Math.min(res, count);
            return;
        }

        if (idx < 0) return;

        for (int i = amount/coins[idx]; i>=0 && i+count < res; i--) {
            mincoin2(coins,amount - (i*coins[idx]), idx-1, count + i);
        }
    }


    public static void main(String[] args) {

        int[] coins = {1,5, 2,10};
        CoinChange cc = new CoinChange();
        int min = cc.coinChange(coins, 5);
        System.out.println(min);
    }
}
