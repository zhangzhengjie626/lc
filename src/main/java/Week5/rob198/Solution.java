package Week5.rob198;

/**
 * https://leetcode.cn/problems/house-robber/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = Math.max(nums[1], res[0]);
        for (int i = 2; i < nums.length; i++) {
            res[i] = Math.max(res[i - 2] + nums[i], res[i - 1]);
        }
        return res[nums.length - 1];
    }
}
//问题在于i-1天是跨天得来的，还是不是跨天得来的，如果不是跨天的来的，i-1就和i-2的值一样，不需要处理
