package TopInterview150.Week4.singleNumber136;

/**
 * 136.只出现一次的数字
 */
public class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] ^ nums[i - 1];
        }
        return nums[nums.length - 1];
    }
    //异或操作 看题解吧
}