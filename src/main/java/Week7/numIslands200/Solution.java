package Week7.numIslands200;

/**
 * https://leetcode.cn/problems/number-of-islands/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int i, int j, char[][] grid) {
        if (i < grid.length && i >= 0 && j >= 0 && j < grid[0].length) {
            if (grid[i][j] == '1') {
                grid[i][j] = '0';
                //为什么是4个方向，不是8个方向？4个方向就可以覆盖全部格子
                dfs(i - 1, j, grid);
                dfs(i, j - 1, grid);
                dfs(i + 1, j, grid);
                dfs(i, j + 1, grid);
            }
        }
    }
}
