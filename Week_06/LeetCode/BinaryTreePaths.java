package LeetCode;


import java.util.ArrayList;
import java.util.List;


/**
 * LeetCode 每日一题
 *
 * 257. 二叉树的所有路径
 * 题目描述:
 *     给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 题解:
 *      官方:  https://leetcode-cn.com/problems/binary-tree-paths/solution/er-cha-shu-de-suo-you-lu-jing-by-leetcode-solution/
 *      方法一：深度优先搜索
 *      方法二：广度优先搜索
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *    理解
 */
public class BinaryTreePaths {


    /**
     * 方法一：深度优先搜索
     * 思路 参考LeeCode 官方
     * 复杂度分析：
     *     时间复杂度：O(N^2)
     *     空间复杂度：O(N^2)
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }
}


/*Definition for a binary tree node.*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
