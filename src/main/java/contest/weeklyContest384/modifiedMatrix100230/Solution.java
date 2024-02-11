package contest.weeklyContest384.modifiedMatrix100230;

import java.util.Arrays;

public class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[] colMax = new int[m];
        Arrays.fill(colMax, -1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                colMax[i] = Math.max(colMax[i], matrix[j][i]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] == -1) {
                    matrix[j][i] = colMax[i];
                }
            }
        }
        return matrix;
    }
}