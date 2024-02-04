package topInterview150.week2.maxProfit121;
/*
121. 买卖股票的最佳时机
 */
public  class Solution {
    public int maxProfit(int[] prices) {
        //我的思路：找当前元素右边剩余元素中最大的
        int curRightMax = prices[prices.length - 1];
        int ans = 0;
        for (int i = prices.length - 2; i >= 0 ; i--) {
            //当前元素右边最大的
            curRightMax = Math.max(prices[i], curRightMax);
            ans = Math.max(ans, curRightMax - prices[i]);
        }
        return ans;
    }
}