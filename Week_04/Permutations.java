import java.util.*;

/**
 *
 * 46. 全排列
 * 题目描述:
 *      给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 *
 *  // 广度优先遍历
 *  // 深度优先遍历(回溯+递归)
 *  //
 */
public class Permutations {

    public void backtrack(int n,
                          ArrayList<Integer> output,
                          List<List<Integer>> res,
                          int first) {
        // 所有数都填完了
        if (first == n)
            res.add(new ArrayList<Integer>(output));
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList();

        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int num : nums)
            output.add(num);

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack2(n, output, res, 0);
        return res;
    }

    private void backtrack2(int length, List<Integer> output, List<List<Integer>> res, int idx) {
        if (idx == length){
            res.add(new ArrayList<>(output));
        }
        for (int i = idx; i < length; i++) {
            Collections.swap(output, idx, i);
            backtrack2(length, output, res, idx + 1);
            Collections.swap(output, idx, i);
        }
    }


    public List<List<Integer>> permute3(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();

        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int length = nums.length;
        backtrack3(length, output, res, 0);
        return res;
    }

    private void backtrack3(int length, List<Integer> output, List<List<Integer>> res, int idx) {
        if (idx == length){
            res.add(new ArrayList<>(output));
        }
        for (int i = idx; i < length; i++) {
            Collections.swap(output, idx, i);
            backtrack3(length, output, res, idx +1);
            Collections.swap(output, idx, i);
        }

    }

}
