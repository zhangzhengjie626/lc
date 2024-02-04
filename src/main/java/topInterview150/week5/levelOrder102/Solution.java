package topInterview150.week5.levelOrder102;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-level-order-traversal/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayList<TreeNode> tmp = new ArrayList<>();
        tmp.add(root);
        int size = 1;
        ArrayList<Integer> cur = new ArrayList<>();
        while (size != 0) {
            TreeNode treeNode = tmp.get(0);
            cur.add(treeNode.val);
            if (treeNode.left != null) {
                tmp.add(treeNode.left);
            }
            if (treeNode.right != null) {
                tmp.add(treeNode.right);
            }
            tmp.remove(0);
            size--;
            if (size == 0) {
                res.add(cur);
                size = tmp.size();
                cur = new ArrayList<>();
            }
        }
        return res;
    }
}
//左右先后放入的顺序问题， 每轮的list清空的时机