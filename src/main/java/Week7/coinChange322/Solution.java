package Week7.coinChange322;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] ans = new int[amount + 1];
        Arrays.fill(ans, amount + 1);
        //等于0的时候，在tmp++处+1了
        ans[0] = 0;
        for (int i = 1; i < ans.length; i++) {
            int tmp = ans[i];
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    tmp = Math.min(tmp, ans[i - coins[j]]);
                }
            }
            tmp++;
            ans[i] = tmp;
        }
        return ans[amount] >= amount + 1 ? -1 : ans[amount];
    }
}
//还是得按自己的思路理一遍，递归转记录中间状态的情况，直接想动态规划，根本想不清楚吧
