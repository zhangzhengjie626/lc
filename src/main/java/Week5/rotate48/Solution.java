package Week5.rotate48;

/**
 * https://leetcode.cn/problems/rotate-image/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = tmp;
            }
        }
    }
}
//n-1的问题  对角线翻转的时候 j<n-i的问题  左右交换的时候 j <= n / 2 - 1的问题