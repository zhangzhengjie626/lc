package topInterview150.week7.numIslands200;

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
                //并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
                dfs(i - 1, j, grid);
                dfs(i, j - 1, grid);
                dfs(i + 1, j, grid);
                dfs(i, j + 1, grid);
            }
        }
    }
}
