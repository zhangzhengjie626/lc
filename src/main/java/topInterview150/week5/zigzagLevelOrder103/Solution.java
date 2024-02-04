package topInterview150.week5.zigzagLevelOrder103;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        List<TreeNode> list = new ArrayList<>();
        int size = 1;
        list.add(root);
        List<Integer> tmp = new ArrayList<>();
        boolean fromLeft = false;
        while (size != 0) {
            TreeNode treeNode;
            if(fromLeft){
                treeNode = list.get(0);
                tmp.add(treeNode.val);
                if (treeNode.right != null) {
                    list.add(treeNode.right);
                }
                if (treeNode.left != null) {
                    list.add(treeNode.left);
                }
                list.remove(0);
            } else {
                treeNode = list.get(list.size()-1);
                tmp.add(treeNode.val);
                if (treeNode.left != null) {
                    list.add(0,treeNode.left);
                }
                if (treeNode.right != null) {
                    list.add(0,treeNode.right);
                }
                list.remove(list.size()-1);
            }
            size--;
            if (size == 0) {
                size = list.size();
                ans.add(tmp);
                tmp = new ArrayList<>();
                fromLeft= !fromLeft;
            }
        }
        return ans;
    }
}
//来回倒有点晕了，但是就是调个顺序的问题