package longestCommonPrefix14;

import java.util.Arrays;

/**
 * 14.最长公共前缀
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        //我的思路：
        //寄1：特例问题
        //寄2：["ab", "a"] tmp[1,0]的情况
        //寄：越做越sb了
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        if (min == 0) {
            return "";
        } else {
            for (int i = 0; i < strs.length - 1; i++) {
                int cur = 0;
                for (int j = 0; j < min; j++) {
                    if (strs[i + 1].charAt(j) == strs[i].charAt(j)) {
                        cur++;
                    } else {
                        //遇到断开的直接break car cir这种
                        break;
                    }
                }
                min = cur;
            }
        }
        return strs[0].substring(0, min);
    }
}