package Week3.wordPattern290;

import java.util.HashMap;

/**
 * 290.单词规律
 */
public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if (s1.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(s1[i])) {
                return false;
            } else {
                map.put(pattern.charAt(i), s1[i]);
            }
        }
        HashMap<String, Character> map1 = new HashMap<>();
        //寄1，"abba" "dog dog dog dog" 反向再匹配一次？
        //不反向匹配有什么好办法呢？
        for (int i = 0; i < s1.length; i++) {
            if (map1.containsKey(s1[i]) && !map1.get(s1[i]).equals(pattern.charAt(i))) {
                return false;
            } else {
                map1.put(s1[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
