package Week4.isSymmetric101;

import Common.TreeNode;

/**
 * 101.对称二叉树
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        //判断左右是否相等的树
        return isSameCur(root, root);
    }

    private boolean isSameCur(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null) || (p.val != q.val)) {
            return false;
        }
        return isSameCur(p.left, q.right) && isSameCur(p.right, q.left);
    }
}