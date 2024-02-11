package contest.weeklyContest384.maxPalindromesAfterOperations100219;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //有些细节想不清楚怎么处理好，肯定不是模拟，肯定是找规律总结处理
    public int maxPalindromesAfterOperations(String[] words) {
        boolean[] palindromes = new boolean[words.length];
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if (check(words[i])) {
                ans++;
                palindromes[i] = true;
            } else {
                for (int j = 0; j < words[i].length(); j++) {
                    map.put(words[i].charAt(j), map.getOrDefault(words[i].charAt(j), 0) + 1);
                }
            }
        }
        int odd = 0;
        for (int i = 0; i < palindromes.length; i++) {
            if (palindromes[i] == false && words[i].length() % 2 == 1) {
                odd++;
            }
        }
        int even = words.length - ans - odd;
        int mapOdd = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 1) {
                mapOdd++;
            }
        }
        if (mapOdd == 0 && odd == 0) {
            ans = words.length;
        } else if (mapOdd == 0) {
            ans += even;
        } else {
            ans += Math.min(odd, mapOdd) + even;
        }
        return ans;

    }

    private boolean check(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
