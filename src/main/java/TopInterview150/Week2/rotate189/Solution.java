package TopInterview150.Week2.rotate189;

/**
 * 189. 轮转数组
 */
public class Solution {
    public int[] rotate(int[] nums, int k) {
        //我的思路：0,length-k-1  length-k,length-1 各自翻转之后，整个数组翻转
        //找规律看出来的
        while (k >= nums.length) {
            k-= nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        return nums;

    }
    //寄1：k超出数组长度时，需要判断

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}