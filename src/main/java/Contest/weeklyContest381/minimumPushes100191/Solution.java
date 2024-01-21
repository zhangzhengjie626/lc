package Contest.weeklyContest381.minimumPushes100191;

public class Solution {
    public int minimumPushes(String word) {
        if (word.length() <= 8) {
            return word.length();
        }
        int nums = word.length();
        int ans = 0, count = 0;
        while (nums - 8 >= 0) {
            count++;
            nums -= 8;
        }
        for (int i = 0; i < count; i++) {
            ans += 8 * (i + 1);
        }
        ans += (word.length() % 8) * (count + 1);
        return ans;
    }
}
//长度是8的倍数的处理