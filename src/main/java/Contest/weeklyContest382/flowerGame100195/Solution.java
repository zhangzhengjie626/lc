package Contest.weeklyContest382.flowerGame100195;

public class Solution {
    public long flowerGame(int n, int m) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans += m / 2;
            } else {
                //根据奇数偶数来的， 不是根据大小来的
                if (m % 2==1) {
                    ans += (m / 2 + 1);
                } else {
                    ans += (m / 2);
                }

            }
        }
        return ans;
    }
}
//超时
//4 2
//1
//2
//2
//1

1 24
2 13
3 24