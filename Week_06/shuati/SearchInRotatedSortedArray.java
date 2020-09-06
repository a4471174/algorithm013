package shuati;

/**
 * 33. 搜索旋转排序数组
 * 题目描述:
 *      假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *      ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *      搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *      你可以假设数组中不存在重复的元素。
 *      你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 题解:
 *      人工制能: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/ji-jian-solution-by-lukelee/
 *
 *  理解程度(不理解\理解\掌握\熟练\精通):
 *      不理解
 *
 */
public class SearchInRotatedSortedArray {


    /**
     * 方法: 二分搜索
     *     思路 参考LeeCode
     * 复杂度分析
     *      时间复杂度：O(logn)
     *      空间复杂度： O(1)
     */
    public int search(int[] nums, int target) {
        if(nums == null | nums.length == 0) return -1;
        int a0 = nums[0];
        int l = 0;
        int r = nums.length - 1;
        if(a0 == target) return 0;
        while(l < r) {
            int mid = (l + r) / 2;
            if(target == nums[mid]) return mid;
            if ((a0 < target && target < nums[mid])
                    || (target < nums[mid] && nums[mid] < a0)
                    || (nums[mid] < a0 && a0 < target)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l == r && target == nums[l] ? l : -1;
    }
}
