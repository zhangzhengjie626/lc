package Week4.getMinimumDifference530;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 530.二叉搜索树的最小绝对差
 */
public class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> resArr = new ArrayList<>();
        midOrder(root, resArr);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < resArr.size(); i++) {
            if (resArr.get(i) - resArr.get(i - 1) < res) {
                res = resArr.get(i) - resArr.get(i - 1);
            }
        }
        return res;
    }

    private void midOrder(TreeNode node, List<Integer> resArr) {
        if (node != null) {
            midOrder(node.left, resArr);
            resArr.add(node.val);
            midOrder(node.right, resArr);
        }
    }
}
//一次过