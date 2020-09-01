package TrainingCamp;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 * 题目描述:
 *      给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */
public class LevelOrder {

    /**
     * 方法: 广度优先遍历 思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：每个点进队出队各一次，故渐进时间复杂度为 O(n)。
     *     空间复杂度：队列中元素的个数不超过 nn 个，故渐进空间复杂度为 O(n)。
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        //按层遍历即可
        //1.
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        //2.
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

}

/**
 *
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

