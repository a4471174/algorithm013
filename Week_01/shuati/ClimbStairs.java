package shuati;

/**
   方式:  递归:
           第1级台阶   1种方法    1
           第2级台阶   2种方法    11     2
           第3级台阶   3种方法    111    12     21
           第4级台阶   5种方法    1111   112    121   211    22     
           ... ...     
           第n级台阶   第n-1级台阶 + 第n-2级台阶 种方法
*/
class ClimbStairs {
    public int climbStairs(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}