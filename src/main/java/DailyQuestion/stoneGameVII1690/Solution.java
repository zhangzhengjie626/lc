package DailyQuestion.stoneGameVII1690;

/**
 * https://leetcode.cn/problems/stone-game-vii/description/?envType=daily-question&envId=Invalid%20Date
 */
//public class Solution {
//    public int stoneGameVII(int[] stones) {
//        int sum = 0;
//        for (int stone : stones) {
//            sum += stone;
//        }
//        return getAns(0, stones.length - 1, 0, 0, stones, sum, true);
//    }
//
//    private int getAns(int left, int right, int a, int b, int[] stones, int curSum, boolean isA) {
//        long res = Long.MAX_VALUE;
//        if (left <= right) {
//            if (isA) {
//                long res1 = getAns(left + 1, right, a + curSum - stones[left], b, stones, curSum - stones[left], !isA);
//                long res2 = getAns(left, right - 1, a + curSum - stones[right], b, stones, curSum - stones[right], !isA);
//                res = Math.max(res1, res2);//这个地方为啥要取最大呢？
//            } else {
//                long res1 = getAns(left + 1, right, a, b + curSum - stones[left], stones, curSum - stones[left], !isA);
//                long res2 = getAns(left, right - 1, a, b + curSum - stones[right], stones, curSum - stones[right], !isA);
//                res = Math.min(res1, res2);
//            }
//        } else {
//            return a - b;
//        }
//        return (int) res;
//    }
//}


public class Solution {
    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] sum = new int[n + 1];
        int[][] memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + stones[i];
        }
        return dfs(0, n - 1, sum, memo);
    }

    public int dfs(int i, int j, int[] sum, int[][] memo) {
        if (i >= j) {
            return 0;
        }
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int res = Math.max(sum[j + 1] - sum[i + 1] - dfs(i + 1, j, sum, memo), sum[j] - sum[i] - dfs(i, j - 1, sum, memo));
        memo[i][j] = res;
        return res;
    }
}

