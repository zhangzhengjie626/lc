package Week5.minSubArrayLen209;

/**
 * https://leetcode.cn/problems/minimum-size-subarray-sum/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int curSum = 0, res = Integer.MAX_VALUE, tmpRes = 0;
        while (left < nums.length && right < nums.length) {
            while (curSum < target && right < nums.length) {
                curSum += nums[right];
                right++;
                tmpRes++;
                if (curSum >= target) {
                    res = Math.min(tmpRes, res);
                }
            }
            while (curSum >= target && left < nums.length) {
                curSum -= nums[left];
                left++;
                tmpRes--;
                if (curSum >= target) {
                    res = Math.min(tmpRes, res);
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
