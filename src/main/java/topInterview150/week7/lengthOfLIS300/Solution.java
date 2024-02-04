package topInterview150.week7.lengthOfLIS300;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/longest-increasing-subsequence/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int[] tmp = new int[nums.length];
        Arrays.fill(tmp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (nums[j] < nums[i]) {
                    tmp[i] = Math.max(tmp[i], tmp[j] + 1);
                }
            }
            ans = Math.max(ans, tmp[i]);
        }
        return ans;
    }
}
