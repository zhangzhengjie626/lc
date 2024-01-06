package Week5.gameOfLife289;

/**
 * https://leetcode.cn/problems/game-of-life/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //更新十位数后需要用个位数判断状态是否存活
                if (board[i][j]%10 == 1) {
                    for (int k = Math.max(i - 1, 0); k < Math.min(n, i + 2); k++) {
                        for (int l = Math.max(j - 1, 0); l < Math.min(m, j + 2); l++) {
                            if (k == i && l == j) {
                               continue;
                            } else{
                                board[k][l] += 10;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int liveNum = board[i][j] / 10;
                int status = board[i][j] % 10;
                if (status == 0 && liveNum == 3) {
                    board[i][j] = 1;
                } else if (status == 1 && liveNum < 2) {
                    board[i][j] = 0;
                } else if (status == 1 && (liveNum == 2 || liveNum == 3)) {
                    board[i][j] = 1;
                } else if (status == 1 && liveNum > 3) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = status;
                }
            }
        }
    }
}
//转换的时候，除了规则之外的其他状态的转换  board[i][j] = status;
//计算中间状态时，排除自己
//Math.min(n, i + 2) 边界范围不是 i+1