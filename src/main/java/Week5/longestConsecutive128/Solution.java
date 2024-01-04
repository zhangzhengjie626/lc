package Week5.longestConsecutive128;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1)) {
                continue;
            } else {
                while (set.contains(nums[i] + tmp)) {
                    tmp++;
                }
                ans = Math.max(ans, tmp);
                tmp = 0;
            }
        }
        return ans;
    }
}

