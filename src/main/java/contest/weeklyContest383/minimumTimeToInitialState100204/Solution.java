package contest.weeklyContest383.minimumTimeToInitialState100204;

public class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        if (word.length() == k) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i < word.length(); i++) {
            //直接暴力算了，懒得想了
            if (word.length() - i * k >= 0 && i * k < word.length()) {
                if (word.substring(i * k).equals(word.substring(0, word.length() - i * k))) {
                    return res;
                }
                res++;
            } else {
                return res;
            }
            //写漏了一个逻辑

        }
        return res;
    }
}
