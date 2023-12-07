package Week4.sortedArrayToBST108;

import Common.TreeNode;

/**
 * 108.将有序数组转换为二叉搜索树
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(0, nums.length - 1, nums);
    }

    private TreeNode convert(int left, int right, int[] nums) {
        if (left <= right) {
            int mid = (left + right) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = convert(left, mid - 1, nums);
            node.right = convert(mid + 1, right, nums);
            return node;
        }
        return null;
    }
}
//寄1- nums.length - 1 边界问题