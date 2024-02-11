package contest.weeklyContest384.countMatchingSubarrays100186;

public class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int m = pattern.length + 1;
        int ans = 0;
        for (int i = 0; i <= nums.length - m; i++) {
            boolean isValid = true;
            for (int k = 0; k < pattern.length; k++) {
                if (pattern[k] == 1) {
                    isValid = nums[i + 1 + k] > nums[i + k];
                } else if (pattern[k] == 0) {
                    isValid = nums[i + 1 + k] == nums[i + k];
                } else {
                    isValid = nums[i + 1 + k] < nums[i + k];
                }
                if (!isValid) {
                    break;
                }

            }
            if (isValid) {
                ans++;
            }
        }
        return ans;
    }
}
