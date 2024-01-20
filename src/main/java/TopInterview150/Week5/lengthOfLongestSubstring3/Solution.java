package TopInterview150.Week5.lengthOfLongestSubstring3;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0, left = 0, right = 0;
        while (left < s.length() && right < s.length()) {
            if(!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right + 1);
                right++;
                res = Math.max(right - left,res);
            } else {
                //wobgrovw left不能变小
                left = Math.max(map.get(s.charAt(right)), left);
                //abba  left > right的时候的处理
                if(left >= right) {
                    map.clear();
                } else {
                    map.remove(s.charAt(right));
                }
                right = Math.max(left, right);

            }
        }
        return res;
    }
}