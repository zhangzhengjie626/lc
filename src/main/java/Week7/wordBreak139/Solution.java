package Week7.wordBreak139;

import java.util.List;

/**
 * https://leetcode.cn/problems/word-break/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] ans = new boolean[s.length() + 1];
        ans[0] = true;
        for (int i = 0; i < s.length(); i++) {
            //判断 "" "leet" ，"l" "eet", "le" "et", "lee" "t",是否合规
            for (int j = 0; j <= i; j++) {
                //举例 leet  从"" "leet" 开始，设置""的时候true
                if (ans[j] && wordDict.contains(s.substring(j, i + 1))) {
                    ans[i + 1] = true;
                    break;
                }
            }
        }
        return ans[s.length()];
    }
}
