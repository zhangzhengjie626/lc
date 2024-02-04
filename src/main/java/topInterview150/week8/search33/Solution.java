package topInterview150.week8.search33;

/**
 * https://leetcode.cn/problems/search-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //只有有序区间可以判断大小，无序区间无法判断中间和两边的大小关系
            //未旋转区间和左边比，旋转区间和右边比
            //本质上是两个升序段合并起来的，在两个升序段内可以用二分，
            //跨过两个升序段的区间，最终会收缩到某个升序段，即使最后只有一个元素
            //收缩到只有一个元素的时候[7,0] 如果是>=7判断在第一段升序区间

            //第一个升序区间 [left,mid]
            if (nums[mid] >= nums[0]) {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target && target >= nums[0]) {
                    //第一个升序区间内
                    right = mid - 1;
                } else {
                    //可能混序，可能另一个升序
                    left = mid + 1;
                }
            } else {
                //第二个升序区间[mid，right]
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    //第二个升序区间内
                    left = mid + 1;
                } else {
                    //可能混序，可能另一个升序 此时无法判断left mid right大小关系，只能直接返回，然后继续收缩
                    right = mid - 1;
                }

            }
        }
        return -1;
    }
}
