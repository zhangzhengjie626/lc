package topInterview150.week4.hasPathSum112;

import common.TreeNode;

/**
 * 112.路径总和
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //特例
        if (root == null) {
            return false;
        }
        return curSum(root, 0, targetSum);
    }

    private boolean curSum(TreeNode node, int curSum, int targetSum) {
        if (node == null) {
            return false;
        } else {
            if (node.left == null && node.right == null) {
                return curSum + node.val == targetSum;
            } else {
                if (node.left != null && node.right == null) {
                    return curSum(node.left, curSum + node.val, targetSum);
                } else if (node.left == null && node.right != null) {
                    return curSum(node.right, curSum + node.val, targetSum);
                } else {
                    return curSum(node.left, curSum + node.val, targetSum) || curSum(node.right, curSum + node.val, targetSum);
                }
            }
        }
    }
}
//寄1：特例
//寄2：[1,2] 非得走到叶子节点上
//寄3：[1]  无语了 肯定有其他判断方法
//寄4：[1,2,null,3,null,4,null,5]
//换了方法
//寄1：[1,2]