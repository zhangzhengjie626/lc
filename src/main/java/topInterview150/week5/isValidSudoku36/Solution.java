package topInterview150.week5.isValidSudoku36;

/**
 * https://leetcode.cn/problems/valid-sudoku/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !check(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check(int li, int lj, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (lj == i) {
                continue;
            } else {
                if (board[li][i] == board[li][lj]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (li == i) {
                continue;
            } else {
                if (board[i][lj] == board[li][lj]) {
                    return false;
                }
            }
        }

        int ni = li / 3;
        int nj = lj / 3;
        for (int i = ni * 3; i < ni * 3 + 3; i++) {
            for (int j = nj * 3; j < nj * 3 + 3; j++) {
                if (board[i][j] == board[li][lj] && i != li && j != lj) {
                    return false;
                }
            }
        }
        return true;
    }
}
