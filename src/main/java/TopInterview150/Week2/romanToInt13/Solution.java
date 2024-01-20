package TopInterview150.Week2.romanToInt13;

import java.util.HashMap;
import java.util.Map;

/**
 * 13.罗马数字转整数
 */
public class Solution {
    public int romanToInt(String s) {
        //我的思路：从左往右判断数值后累加
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        int i = 0;
        int ans = 0;
        while (i < s.length()) {
            if (i + 2 <= s.length() && map.containsKey(s.substring(i, i + 2))) {
                ans += map.get(s.substring(i, i + 2));
                i+=2;

            } else if (i + 1  <= s.length() && map.containsKey(s.substring(i, i + 1))) {
                ans += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return ans;
    }
}