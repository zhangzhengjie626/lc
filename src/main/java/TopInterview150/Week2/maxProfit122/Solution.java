package TopInterview150.Week2.maxProfit122;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class Solution {
    public int maxProfit(int[] prices) {
        //我的思路：一共有3种状态，未买入->买入， 买入->持有，买入->卖出， 未买入->未买入
        //直接递归所有情况，记录最大利润，当前利润 = 之前的利润 + 现在卖出获得的利润（卖出时价格 - 买入时价格）
        //思路2：二维数组列出所有的情况，然后找规律，二维数组的行，表示第一天买，第x天卖的最大利润
        //有点没想太明白，直觉上是上边的值，和左边的值+昨天到今天买卖的利润的最大值，
        // 上边的值表示前几天买，今天直接卖，就一次，
        //左边的值，表示前几天有买有卖到前一天的最大利润，不确定想的对不对，试一下，不行就看题解

        //不太对，但是歪打正着，周末看题解把这种类型的题目，都过一下吧


        //寄：199/200的时候，最后一个判例，超出内存限制，还得优化，基本思路是ok的。
        //只能用一维的数组
        int[] res = new int[prices.length];
        //防止边界问题，先全部赋值0
        for (int i = 0; i < prices.length; i++) {
            //初始化第一行数据
                res[i] = Math.max(0, prices[i] - prices[0]);
        }
        for (int i = 1; i < prices.length; i++) {
            res[i] = Math.max(res[i - 1] + Math.max(0, prices[i] - prices[i - 1]), res[i]);
        }
        return res[prices.length - 1];
    }
}