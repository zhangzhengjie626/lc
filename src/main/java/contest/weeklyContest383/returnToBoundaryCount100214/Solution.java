package contest.weeklyContest383.returnToBoundaryCount100214;

public class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int ans = 0, tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            if (tmp == 0) {
                ans++;
            }
        }
        return ans;
    }
}
