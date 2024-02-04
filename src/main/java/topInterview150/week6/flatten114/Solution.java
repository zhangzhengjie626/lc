package topInterview150.week6.flatten114;

import common.TreeNode;

/**
 * https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public void flatten(TreeNode root) {
        getAns(root);
    }

    private void getAns(TreeNode node) {
        if (node != null) {
            TreeNode tmpRight = null;
            if (node.right != null) {
                tmpRight = node.right;
            }
            //左边
            if (node.left != null) {
                node.right = node.left;
                node.left = null;
                getAns(node.right);
            }
            //右边
            if (tmpRight != null) {
                getAns(tmpRight);
            }
            //右边接在左边的右边
            if (node.right != tmpRight) {
                TreeNode tmp = node.right;
                //右边节点接进去的位置问题，需要在最右边
                while (tmp.right != null) {
                    tmp = tmp.right;
                }
                tmp.right = tmpRight;
            }
        }
    }
}
