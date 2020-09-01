package shuati;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 *
 * 题目描述:
 *      给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
 *
 *  方法1: 暴力法
 *      两层for循环
 *      时间复杂度: O(n*k)
 *      空间复杂度: O(n)
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow3(int[] nums, int k) {

        if (nums.length == 0) {
            return new int[0];
        }

        int[] maxArr = new int[nums.length-k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {

            int max = nums[i];
            for (int j = 1; j < k; j++) {

                if (nums[j+i] > max ) {
                    max = nums[j+i];
                }
            }
            maxArr[i] = max;
        }

        return maxArr;
    }


    public int[] maxSlidingWindow2(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i < k; i++) { // 未形成窗口
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for(int i = k; i < nums.length; i++) { // 形成窗口后
            if(deque.peekFirst() == nums[i - k])
                deque.removeFirst();
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }


    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length ==0 || k==0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() <nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if(deque.peekFirst() == nums[i -k])
                deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;

    }

}
