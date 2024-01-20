package TopInterview150.Week2.strStr28;

/**
 * 28. 找出字符串中第一个匹配项的下标
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        //我的思路：暴力比较拉倒
        //寄1.长短问题
        /**
         * haystack =
         * "aaa"
         * needle =
         * "aaaa"
         */
        //寄2：右边界问题
        /**
         * haystack =
         * "mississippi"
         * needle =
         * "issipi"
         */
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
