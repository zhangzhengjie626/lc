package TopInterview150.Week4.countNodes222;

import Common.TreeNode;

/**
 * 222.完全二叉树的节点个数
 */
public class Solution {

    private int ans = 0;

    public int countNodes(TreeNode root) {
        count(root);
        return ans;
    }

    private void count(TreeNode node) {
        if (node != null) {
            ans++;
            countNodes(node.left);
            countNodes(node.right);
        }
    }
}
//笨办法一次过