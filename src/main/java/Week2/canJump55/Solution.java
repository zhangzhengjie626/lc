package Week2.canJump55;

/**
 * 55.跳跃游戏
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int curMax = nums[0];
        //每次一批跳的位置，都更新最长的位置
        for (int i = 0; i <= Math.min(nums.length - 1, curMax); i++) {
            curMax = Math.max(nums[i] + i, curMax);
            if (curMax >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
