package Week6.kthSmallest230;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/kth-smallest-element-in-a-bst/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res.get(k - 1);
    }

    private void inorder(TreeNode node, List<Integer> ans) {
        if (node != null) {
            if (node.left != null) {
                inorder(node.left, ans);
            }
            ans.add(node.val);
            if (node.right != null) {
                inorder(node.right, ans);
            }
        }
    }
}
//看题解吧