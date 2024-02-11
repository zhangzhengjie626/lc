package dailyQuestion.preorderTraversal144;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-preorder-traversal/?envType=daily-question&envId=2024-02-11
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        getAns(root, ans);
        return ans;
    }

    private void getAns(TreeNode node, List<Integer> res) {
        if (node != null) {
            res.add(node.val);
            getAns(node.left, res);
            getAns(node.right, res);
        }
    }
}
