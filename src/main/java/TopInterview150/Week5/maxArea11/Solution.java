package TopInterview150.Week5.maxArea11;

/**
 * https://leetcode.cn/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (left < right) {
            int cur = (right - left) * Math.min(height[left], height[right]);
            ans = Math.max(cur, ans);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}