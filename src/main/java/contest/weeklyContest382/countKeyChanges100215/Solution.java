package contest.weeklyContest382.countKeyChanges100215;

public class Solution {
    public int countKeyChanges(String s) {
        if (s.length() == 1 || s.isEmpty()) {
            return 0;
        }
        String upperCase = s.toUpperCase();
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if (upperCase.charAt(i) != upperCase.charAt(i - 1)) {
                ans++;
            }
        }
        return ans;
    }
}
