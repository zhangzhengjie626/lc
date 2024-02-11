package contest.weeklyContest384.countMatchingSubarrays100198;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int[] reArrange = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                reArrange[i - 1] = 1;
            } else if (nums[i] == nums[i - 1]) {
                reArrange[i - 1] = 0;
            } else {
                reArrange[i - 1] = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer s : pattern) {
            if (s == -1) {
                sb.append(2);
            } else {
                sb.append(s);
            }
        }
        String t = sb.toString();
        StringBuilder sb1 = new StringBuilder();
        for (Integer s : reArrange) {
            if (s == -1) {
                sb1.append(2);
            } else {
                sb1.append(s);
            }
        }
        String ori = sb1.toString();
        //KMP算法 勉强套出来了，难顶
        List<Integer> search = search(ori, t);
        return search.size();
    }

    // 在文本 text 中寻找模式串 pattern，返回所有匹配的位置开头
    List<Integer> search(String text, String pattern) {
        List<Integer> positions = new ArrayList<>();
        int[] maxMatchLengths = calculateMaxMatchLengths(pattern);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            while (count > 0 && pattern.charAt(count) != text.charAt(i)) {
                count = maxMatchLengths[count - 1];
            }
            if (pattern.charAt(count) == text.charAt(i)) {
                count++;
            }
            if (count == pattern.length()) {
                positions.add(i - pattern.length() + 1);
                count = maxMatchLengths[count - 1];
            }
        }
        return positions;
    }

    int[] calculateMaxMatchLengths(String pattern) {
        int[] maxMatchLengths = new int[pattern.length()];
        int maxLength = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (maxLength > 0 && pattern.charAt(maxLength) != pattern.charAt(i)) {
                maxLength = maxMatchLengths[maxLength - 1]; // ①
            }
            if (pattern.charAt(maxLength) == pattern.charAt(i)) {
                maxLength++; // ②
            }
            maxMatchLengths[i] = maxLength;
        }
        return maxMatchLengths;
    }
}
