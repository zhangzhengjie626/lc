package TopInterview150.Week8.searchMatrix74;

/**
 * https://leetcode.cn/problems/search-a-2d-matrix/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int top = 0, buttom = n - 1;
        while (top <= buttom) {
            int mid = top + (buttom - top) / 2;
            if (matrix[mid][m - 1] < target) {
                top = mid + 1;
            } else {
                buttom = mid - 1;
            }
        }
        if (top != n) {
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[top][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left != m) {
                if (matrix[top][left] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
//[[1]]  特例  判断是否到了边界  top != n  left != m