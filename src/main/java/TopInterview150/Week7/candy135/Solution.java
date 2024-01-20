package TopInterview150.Week7.candy135;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/candy/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int candy(int[] ratings) {
        int ans = ratings.length;
        int[] res = new int[ratings.length];
        Arrays.fill(res, 1);
        for (int i = ratings.length - 1; i >= 1; i--) {
            while (ratings[i - 1] > ratings[i] && res[i - 1] <= res[i]) {
                ans++;
                res[i - 1] = res[i - 1] + 1;
            }
        }
        for (int i = 1; i < ratings.length; i++) {
            while (ratings[i] > ratings[i - 1] && res[i] <= res[i - 1]) {
                ans++;
                res[i] = res[i] + 1;
            }
        }
        return ans;
    }
}
//[1,3,2,2,1] 原本符合条件就不需要加了 emmmm效率为啥这么低？
