package topInterview150.week5.rightSideView199;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<TreeNode> tmp = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        int size = 1;
        tmp.add(root);
        boolean isFirst = true;
        while (size != 0) {
            TreeNode treeNode = tmp.get(tmp.size() - 1);
            if (isFirst) {
                res.add(treeNode.val);
                isFirst = false;
            }
            tmp.remove(tmp.size() - 1);
            if (treeNode.right != null) {
                tmp.add(0,treeNode.right);
            }
            if (treeNode.left != null) {
                tmp.add(0,treeNode.left);
            }
            size--;
            if (size == 0) {
                isFirst = true;
                size = tmp.size();
            }
        }
        return res;
    }
}
//特例[]