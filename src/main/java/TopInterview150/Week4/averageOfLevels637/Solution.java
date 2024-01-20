package TopInterview150.Week4.averageOfLevels637;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 637.二叉树的层平均值
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> res = new ArrayList<>();
        int max = maxDepth(root, 0);
        double[] num = new double[max];
        double[] sum = new double[max];
        Arrays.fill(num, 0);
        Arrays.fill(sum, 0);
        count(root, 0, num, sum);
        for (int i = 0; i < max; i++) {
            res.add(sum[i] / num[i]);
        }
        return res;
    }

    private int maxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        } else {
            return Math.max(maxDepth(node.left, depth + 1), maxDepth(node.right, depth + 1));
        }
    }

    private void count(TreeNode node, int depth, double[] num, double[] sum) {
        if (node != null) {
            num[depth]++;
            sum[depth] += node.val;
            count(node.left, depth + 1, num, sum);
            count(node.right, depth + 1, num, sum);
        }
    }
}
//寄1 int范围越界