package topInterview150.week6.isValidBST98;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/validate-binary-search-tree/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        Map<TreeNode, Long> max = new HashMap<>();
        Map<TreeNode, Long> min = new HashMap<>();
        //计算
        getMax(root, max);
        getMin(root, min);
        return check(root, max, min);
    }

    private void getMax(TreeNode node, Map<TreeNode, Long> max) {
        if (node != null) {
            if (node.left != null) {
                getMax(node.left, max);
            }
            if (node.right != null) {
                getMax(node.right, max);
            }
            long left = max.getOrDefault(node.left, Long.MIN_VALUE);
            long right = max.getOrDefault(node.right, Long.MIN_VALUE);
            max.put(node, Math.max(Math.max(left, right), node.val));
        }
    }


    private void getMin(TreeNode node, Map<TreeNode, Long> min) {
        if (node != null) {
            if (node.left != null) {
                getMin(node.left, min);
            }
            if (node.right != null) {
                getMin(node.right, min);
            }
            long left = min.getOrDefault(node.left, Long.MAX_VALUE);
            long right = min.getOrDefault(node.right, Long.MAX_VALUE);
            min.put(node, Math.min(Math.min(left, right), node.val));
        }
    }

    private boolean check(TreeNode node, Map<TreeNode, Long> max, Map<TreeNode, Long> min) {
        if (node == null) {
            return true;
        } else {
            if (node.left != null) {
                if (max.get(node.left) >= node.val) {
                    return false;
                }
            }
            if (node.right != null) {
                if (min.get(node.right) <= node.val) {
                    return false;
                }
            }
            return check(node.left, max, min) && check(node.right, max, min);
        }
    }
}
