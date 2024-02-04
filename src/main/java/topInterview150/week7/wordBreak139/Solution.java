package topInterview150.week7.wordBreak139;

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
//思路有点不畅，这种题感觉看了答案都不太好理解。。。下次不太好自己能想出来怎么做
//从个人思路出发，从前往后，找到符合的，然后再对剩下的判断是否符合（剩下部分的判断，同样是从前往后找，找到符合的，判断剩下的）
//个人思路是递归的，动态规划感觉是把递归的中间结果记下来，回头再想想，怎么从自己的思路转到这种做法上来
