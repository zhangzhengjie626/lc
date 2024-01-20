package TopInterview150.Week7.solve130;

/**
 * https://leetcode.cn/problems/surrounded-regions/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public void solve(char[][] board) {
        //边界判断
        int n = board.length;
        int m = board[0].length;
        //左
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                dfs(i, 0, board);
            }
        }
        //右
        for (int i = 0; i < n; i++) {
            if (board[i][m - 1] == 'O') {
                dfs(i, m - 1, board);
            }
        }
        //上
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                dfs(0, i, board);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[n - 1][i] == 'O') {
                dfs(n - 1, i, board);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void dfs(int i, int j, char[][] board) {
        if (i < board.length && i >= 0 && j >= 0 && j < board[0].length) {
            if (board[i][j] == 'O') {
                board[i][j] = 'A';
                dfs(i - 1, j, board);
                dfs(i, j - 1, board);
                dfs(i + 1, j, board);
                dfs(i, j + 1, board);
            }
        }
    }
}
