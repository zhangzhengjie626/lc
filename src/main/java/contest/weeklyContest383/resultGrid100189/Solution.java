package contest.weeklyContest383.resultGrid100189;

public class Solution {
    public int[][] resultGrid(int[][] image, int threshold) {
        //暴力模拟了
        int n = image.length, m = image[0].length;
        int[][] res = new int[n][m];
        int[][] resCount = new int[n][m];
        for (int i = 0; i + 3 <= n; i++) {
            for (int j = 0; j + 3 <= m; j++) {
                //检查是否合理区域
                boolean isVaild = true;

                for (int k = i; k < i + 3; k++) {
                    if (!isVaild) {
                        break;
                    }
                    for (int l = j; l < j + 3; l++) {
                        if (!isVaild) {
                            break;
                        }
                        if (k + 1 >= i && k + 1 < i + 3) {
                            if (Math.abs(image[k + 1][l] - image[k][l]) > threshold) {
                                isVaild = false;
                                break;
                            }
                        }
                        if (k - 1 >= i && k - 1 < i + 3) {
                            if (Math.abs(image[k - 1][l] - image[k][l]) > threshold) {
                                isVaild = false;
                                break;
                            }
                        }
                        if (l - 1 >= j && l - 1 < j + 3) {
                            if (Math.abs(image[k][l - 1] - image[k][l]) > threshold) {
                                isVaild = false;
                                break;
                            }
                        }
                        if (l + 1 >= j && l + 1 < j + 3) {
                            if (Math.abs(image[k][l + 1] - image[k][l]) > threshold) {
                                isVaild = false;
                                break;
                            }
                        }
                    }
                }
                if (isVaild) {
                    int tmpSum = 0;
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            tmpSum += image[k][l];
                        }
                    }
                    tmpSum = (int) Math.floor(tmpSum / 9.0);
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            res[k][l] += tmpSum;
                            resCount[k][l]++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (resCount[i][j] == 0) {
                    res[i][j] = image[i][j];
                } else {
                    res[i][j] = res[i][j] / resCount[i][j];
                }
            }
        }
        return res;
    }
}
