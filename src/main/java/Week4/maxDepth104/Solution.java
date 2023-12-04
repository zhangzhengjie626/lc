package Week4.maxDepth104;

import Common.TreeNode;

/**
 * 104.二叉树的最大深度
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        return curDepth(root, 0);
    }

    private int curDepth(TreeNode node, int curDepth) {
        if (node == null) {
            return curDepth;
        } else {
            return Math.max(curDepth(node.left, curDepth + 1), curDepth(node.right, curDepth + 1));
        }
    }
}
