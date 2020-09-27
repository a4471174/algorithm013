package LeetCode;


/**
 * 968. 监控二叉树
 * 题目描述:
 *      给定一个二叉树，我们在树的节点上安装摄像头。
 *      节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
 *      计算监控树的所有节点所需的最小摄像头数量。
 *
 *
 * 题解:
 *      官方:https://leetcode-cn.com/problems/binary-tree-cameras/solution/jian-kong-er-cha-shu-by-leetcode-solution/
 *          方法一：递归
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      方法一：递归, 没理解
 *
 */
public class JianKongErChaShuByLeetcodeSolution {

    /**
     * 方法一：递归
     * 思路 参考LeeCode 官方
     * 复杂度分析
     *     时间复杂度：O(N)。
     *     空间复杂度：O(N)。
     */
    public int minCameraCover(TreeNode root) {
        int[] array = dfs(root);
        return array[1];
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE / 2, 0, 0};
        }
        int[] leftArray = dfs(root.left);
        int[] rightArray = dfs(root.right);
        int[] array = new int[3];
        array[0] = leftArray[2] + rightArray[2] + 1;
        array[1] = Math.min(array[0], Math.min(leftArray[0] + rightArray[1], rightArray[0] + leftArray[1]));
        array[2] = Math.min(array[0], leftArray[1] + rightArray[1]);
        return array;
    }
}
