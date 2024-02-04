package topInterview150.week8.threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/3sum/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //遇到重复的跳过
            if (i > 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            int res = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] < res) {
                    //left去重
                    left++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (nums[left] + nums[right] > res) {
                    //right去重
                    right--;
                    while (right >= 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[left] + nums[right] == res) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //left right去重
                    left++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    right--;
                    while (right >= 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}

//-4 -1 -1 0 1  2
//[-2,0,0,2,2]  错1  left right里去重的问题
//开头也要去重，开头在开头的地方比较去重，左右在内循环里判断去重
