package LeetCode;

import java.util.*;

/**
 * LeetCode 每日一题
 *
 * 107. 二叉树的层次遍历 II
 * 题目描述:
 *      给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/solution/er-cha-shu-de-ceng-ci-bian-li-ii-by-leetcode-solut/
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      理解
 *      抄了1遍,广度优先遍历代码不怎么熟悉.需要多练习
 */
public class BinaryTreeLevelOrderTraversalII {


    /**
     * 方法 递归
     * 思路 自己想的, 花了20分钟
     */
    public List<List<Integer>> levelOrderBottom11(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        return bfs(nodes, lists);
    }

    private List<List<Integer>> bfs(List<TreeNode> nodes, List<List<Integer>> lists) {
        if (nodes == null || nodes.size()==0) {
            Collections.reverse(lists);
            return lists; // 倒序排列
        }
        List<TreeNode> tmp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if(nodes.get(i)!=null){
                list.add(nodes.get(i).val);
                tmp.add(nodes.get(i).left);
                tmp.add(nodes.get(i).right);
            }
        }
        if (list.size()>0){
            lists.add(list);
        }
        bfs(tmp,lists);
        return lists;
    }


    /**
     * 方法 广度优先遍历
     * 思路 参考LeeCode 官方
     * 复杂度分析：
     *     时间复杂度：O(n)
     *     空间复杂度：O(n)
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
        if (root == null) {
            return levelOrder;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            levelOrder.add(0, level);
        }
        return levelOrder;
    }


    public List<List<Integer>> levelOrderBottom1(TreeNode root) {

        List<List<Integer>> levelOrder = new LinkedList<>();
        if (root == null) {
            return levelOrder;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            levelOrder.add(0, level);
        }

        return levelOrder;
    }




    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();

        if (root == null) {
            return levelOrder;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null) queue.offer(left);
                if (right != null) queue.offer(right);
            }
            levelOrder.add(0, level);
        }

        return levelOrder;
    }








    public static void main(String[] args) {
        //[3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.val = 3;
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        new BinaryTreeLevelOrderTraversalII().levelOrderBottom(root);
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
