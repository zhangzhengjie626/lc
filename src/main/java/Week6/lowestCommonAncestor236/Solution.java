package Week6.lowestCommonAncestor236;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathsP = getPaths(root, p, new ArrayList<>());
        List<TreeNode> pathsQ = getPaths(root, q, new ArrayList<>());
        TreeNode res = null;

        int length = Math.min(pathsP.size(), pathsQ.size());
        for (int i = 0; i < length; i++) {
            if (pathsP.get(i) == pathsQ.get(i)) {
                res = pathsQ.get(i);
            }
        }
        return res;
    }

    private List<TreeNode> getPaths(TreeNode start, TreeNode des, List<TreeNode> paths) {
        if (start != null) {
            paths.add(start);
            if (start == des) {
                return paths;
            } else {
                List<TreeNode> paths1 = null;
                List<TreeNode> paths2 = null;
                if (start.left != null) {
                    paths1 = getPaths(start.left, des, new ArrayList<>(paths));
                }
                if (start.right != null) {
                    paths2 = getPaths(start.right, des, new ArrayList<>(paths));
                }
                return paths1 == null ? paths2 : paths1;
            }
        }
        return null;
    }
}
//超出内存限制 寄