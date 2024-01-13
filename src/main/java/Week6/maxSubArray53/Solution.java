package Week6.maxSubArray53;

/**
 * https://leetcode.cn/problems/maximum-subarray/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}
//初始化