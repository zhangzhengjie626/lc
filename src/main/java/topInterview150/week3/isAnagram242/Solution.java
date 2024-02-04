package topInterview150.week3.isAnagram242;

import java.util.HashMap;
import java.util.Map;

/**
 * 242.有效的字母异位词
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        //寄1： "ab"  "a" 长度判断
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            } else {
                if (map.get(t.charAt(i)) - 1 < 0) {
                    return false;
                }
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }
        return true;
    }
}