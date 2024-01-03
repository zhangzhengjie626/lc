package Week5.sumNumbers129;

import Common.TreeNode;

import java.sql.Array;
import java.util.ArrayList;

/**
 * https://leetcode.cn/problems/sum-root-to-leaf-numbers/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        getNumbers(root, "", list);
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += Integer.parseInt(list.get(i));
        }
        return res;
    }

    private void getNumbers(TreeNode node, String cur, ArrayList<String> list) {
        if (node != null) {
            cur += node.val;
            if (node.left != null) {
                getNumbers(node.left, cur, list);
            }
            if (node.right != null) {
                getNumbers(node.right, cur, list);
            }
            if (node.left == null && node.right == null) {
                list.add(cur);
            }
        }
    }
}
//做出来了但是效率不高，看题解吧