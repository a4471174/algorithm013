package LeetCode;


/**
 * LeetCode 每日一题 2020.09.01
 * 486. 预测赢家
 * 题目描述:
 *    给定一个表示分数的非负整数数组。 玩家 1 从数组任意一端拿取一个分数，随后玩家 2 继续从剩余数组任意一端拿取分数，然后玩家 1 拿，…… 。
 *    每次一个玩家只能拿取一个分数，分数被拿取之后不再可取。直到没有剩余分数可取时游戏结束。最终获得分数总和最多的玩家获胜。
 *    给定一个表示分数的数组，预测玩家1是否会成为赢家。你可以假设每个玩家的玩法都会使他的分数最大化。
 */
public class PredictTheWinner {


    /**
     * 方法: 递归 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(2^n)，其中 nn 是数组的长度。
     *      空间复杂度：O(n)O(n)，其中 nn 是数组的长度。空间复杂度取决于递归使用的栈空间。
     */
    public boolean PredictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1, 1) >= 0;
    }

    public int total(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);
        return Math.max(scoreStart * turn, scoreEnd * turn) * turn;
    }


    public boolean PredictTheWinner2(int[] nums) {
        return total2(nums, 0, nums.length -1, 1) >=0;
    }

    private int total2(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end -1, -turn);
        return Math.max(scoreStart * turn, scoreEnd * turn) *turn;

    }


}
