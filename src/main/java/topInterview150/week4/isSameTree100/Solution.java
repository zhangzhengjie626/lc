package topInterview150.week4.isSameTree100;

import common.TreeNode;

/**
 * 100.相同的树
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameCur(p, q);
    }

    private boolean isSameCur(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null) || (p.val != q.val)) {
            return false;
        }
        return isSameCur(p.left, q.left) && isSameCur(p.right, q.right);
    }

}
//一次过