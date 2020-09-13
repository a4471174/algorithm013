package LeetCode;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode 每日一题
 *
 * 347. 前 K 个高频元素
 * 题目描述:
 *      给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/top-k-frequent-elements/solution/qian-k-ge-gao-pin-yuan-su-by-leetcode-solution/
 *          方法一：堆
 *          方法二：基于快速排序
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：堆 理解, 抄了1遍
 *
 */
public class TopKFrequent {

    /**
     * 方法 堆
     * 思路 参考LeeCode 官方
     * 复杂度分析：
     *     时间复杂度：O(Nlogk)
     *     空间复杂度：O(N)
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // int[] 的第一个元素代表数组的值，第二个元素代表了该值出现的次数
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            } else {
                queue.offer(new int[]{num, count});
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; ++i) {
            ret[i] = queue.poll()[0];
        }
        return ret;
    }

}
