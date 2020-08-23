import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * 70. 爬楼梯
 * 题目描述:
 *      假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *      每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 *
 */
class ClimbStairs2 {


    /**
     *  方法1: 递归
     *      思路
     *          参考LeeCode
     *      复杂度分析
     *          时间复杂度：O(2^n)。
     *          空间复杂度：O(n)。
     */
    public int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    /**
     *  方法2: 记忆化递归
     *      思路
     *          参考LeeCode
     *      复杂度分析
     *          时间复杂度：O(n)。
     *          空间复杂度：O(n)。
     */
    public int climbStairsCache(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        int res = climbStairs2(n, cache);
        return res;
    }

    private int climbStairs2(int n, Map<Integer, Integer> cache) {
        if (cache.containsKey(n)) return cache.get(n);

        if (n == 1) cache.put(1, 1);
        if (n == 2) cache.put(2, 2);
        if (n >= 3) cache.put(n, climbStairs2(n-1, cache) + climbStairs2(n-2, cache));

        return cache.get(n);
    }
}