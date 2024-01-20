package TopInterview150.Week3.jump45;

/**
 * 45.跳跃游戏II
 */
public class Solution {
    public int jump(int[] nums) {
        int curMax = nums[0];
        int begin = 0;
        int end = Math.min(curMax, nums.length - 1);
        int ans = 0;
        //判断当前是否已经可以跳到最后位置
        while (curMax < nums.length - 1) {
            for (int i = begin; i <= Math.min(nums.length - 1, end); i++) {
                curMax = Math.max(nums[i] + i, curMax);
            }
            ans++;
            begin = end + 1;
            end = Math.min(curMax, nums.length - 1);
        }
        return nums.length == 1 ? 0 : ans + 1;// 有跳跃能力，不一定需要最后一跳，需要判断当前是否已经在终点了。
    }
}