package topInterview150.week8.uniquePathsWithObstacles63;

/**
 * https://leetcode.cn/problems/unique-paths-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        //一开始就在终点的特殊情况
        if (n == m && n == 1 && obstacleGrid[0][0] == 0) {
            return 1;
        }
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        //一开始就不通已经考虑了，这里就直接默认一开始是通的
        int[][] res = new int[n][m];
        res[0][0] = 1;
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[i][0] == 0) {
                res[i][0] = res[i - 1][0];
            }

        }
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[0][i] == 0) {
                res[0][i] = res[0][i - 1];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    res[i][j] = 0;
                } else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[n - 1][m - 1];
    }
}
//特例[[0]]  一开始就在终点
//特例[[1,0]]  永远到不了终点
//[[0,0],[1,1],[0,0]]  初始化条件错误，可能是不通的