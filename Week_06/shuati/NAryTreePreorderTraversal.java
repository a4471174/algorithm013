package shuati;


import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * 题目描述:
 *     给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *     理解
 *     背诵1遍
 */
public class NAryTreePreorderTraversal {


    /**
     * 方法:递归 思路 前序遍历 根-左-右
     * 复杂度分析
     */
    public List<Integer> preorder(Node root) {

        return recursion(root,new ArrayList<Integer>());
    }

    private List<Integer> recursion(Node root, List<Integer> list) {
        if (root == null) return list;

        //根
        list.add(root.val);
        //左
        if (root.children!=null) {
            for (Node child : root.children) {
                recursion(child,list);
            }
        }
        //右

        return list;
    }


    public List<Integer> preorder2(Node root) {
        return recursion2(root, new ArrayList<Integer>());

    }

    private List<Integer> recursion2(Node root, ArrayList<Integer> list) {
        if (root == null) return list;

        list.add(root.val);

        if (root.children != null) {
            for (Node child : root.children) {
                recursion2(child, list);
            }
        }

        return list;
    }
}


/*
// Definition for a Node.
*/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
