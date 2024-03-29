package topInterview150.week8.minPathSum64;

/**
 * https://leetcode.cn/problems/minimum-path-sum/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int minPathSum(int[][] grid) {

        int n = grid.length, m = grid[0].length;
        for (int i = 1; i < n; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[n - 1][m - 1];
    }
}
