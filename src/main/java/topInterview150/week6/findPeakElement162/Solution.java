package topInterview150.week6.findPeakElement162;

/**
 * https://leetcode.cn/problems/find-peak-element/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //把两种情况具体写一下算了，老想合并起来，乱七八糟的
            if (left != mid) {
                //左边有空间
                if (nums[mid] > nums[mid - 1]) {
                    left = mid;//这个地方不能加1，本身可能就是最高点
                } else {
                    //下坡的时候，mid不可能是最高点，可以mid-1
                    right = mid - 1;
                }
            } else {
                //左边到顶了
                if (nums[left] > nums[right]) {
                    return left;
                } else {
                    return right;
                }
            }
        }
        //左等于右的时候，随便返回一个
        return left;
    }
}
//爬坡可以找到相对高点