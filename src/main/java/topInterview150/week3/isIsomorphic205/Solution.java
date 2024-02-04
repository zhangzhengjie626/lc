package topInterview150.week3.isIsomorphic205;

import java.util.HashMap;
import java.util.Map;

/**
 * 205.同构字符串
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        //寄1 "badc", "baba"
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        //再判断一遍从t到s?
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map1.containsKey(t.charAt(i)) && map1.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            } else {
                map1.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}