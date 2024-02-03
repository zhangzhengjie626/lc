package DailyQuestion.canWinNim292;

/**
 * https://leetcode.cn/problems/nim-game/?envType=daily-question&envId=2024-02-04
 */
public class Solution {
    public boolean canWinNim(int n) {
//        if (n <= 3) {
//            return true;
//        }
//        boolean[] res = new boolean[n + 1];
//        res[0] = true;
//        res[1] = true;
//        res[2] = true;
//        res[3] = true;
//        for (int i = 4; i <= n; i++) {
//            res[i] = !res[i - 1] || !res[i - 2] || !res[i - 3];
        //这个地方的想法是，res[i]只能由res[i - 1] res[i - 2] res[i - 3] 三个状态转移过来，这三个状态中只要有一个是false res[i]就是true
//        }
//        return res[n];
        return n % 4 != 0;
    }

}
//error:超出内存限制  1348820612  递归式子推规律
//找规律发现 1 2 3 4 5 6 7 8
//         t t t f t t t f