package topInterview150.week6.bSTIterator173;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-search-tree-iterator/?envType=study-plan-v2&envId=top-interview-150
 */
public class BSTIterator {
    List<Integer> ans;
    int loc;

    public BSTIterator(TreeNode root) {
        ans = new ArrayList<>();

        getAns(root);
    }

    public int next() {
        int i = ans.get(0);
        ans.remove(0);
        return i;
    }

    public boolean hasNext() {
        return !ans.isEmpty();
    }

    private void getAns(TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                getAns(node.left);
            }
            ans.add(node.val);
            if (node.right != null) {
                getAns(node.right);
            }
        }
    }
}
//为啥这效率还低呢？。。。