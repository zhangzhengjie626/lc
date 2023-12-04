package Week4.invertTree226;

import Common.TreeNode;

/**
 * 226.翻转二叉树
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        invertCurNode(root);
        return root;
    }

    private void invertCurNode(TreeNode node) {
        if (node != null) {
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            invertCurNode(node.left);
            invertCurNode(node.right);
        }
    }
}