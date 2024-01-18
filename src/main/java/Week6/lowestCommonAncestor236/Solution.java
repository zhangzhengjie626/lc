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
    //超出内存限制 寄


    //学习了大神的写法
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor1(root.left, p, q);
        TreeNode right = lowestCommonAncestor1(root.right, p, q);

        if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        } else {
            return null;
        }
    }
    //感觉就很妙，没做过真的想不到这种方式
}
