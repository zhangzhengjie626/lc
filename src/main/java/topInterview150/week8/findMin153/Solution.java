package topInterview150.week8.findMin153;

/*
https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //左边区间升序  =的情况 如果最后收缩到[7,0],需要找0的位置因此left = mid + 1
            if (nums[mid] >= nums[0]) {
                left = mid + 1;
            } else {
                //右边区间升序，左边乱序or刚好中间点
                right = mid - 1;
            }
        }
        return left == nums.length ? nums[0] : nums[left];
    }
}
//[2,1]  1
