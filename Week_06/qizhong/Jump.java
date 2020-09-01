package qizhong;

/**
 *
 *
 * 45. 跳跃游戏 II
 * 题目描述:
 *      给定一个非负整数数组，你最初位于数组的第一个位置。
 *      数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *      你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 */
public class Jump {

    /**
     * 方法：反向查找出发位置 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(n^2)，其中 nn 是数组长度。有两层嵌套循环，在最坏的情况下，例如数组中的所有元素都是 11，position 需要遍历数组中的每个位置，对于 position 的每个值都有一次循环。
     *     空间复杂度：O(1)O(1)。
     */
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}
