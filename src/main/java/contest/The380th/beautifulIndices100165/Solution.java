package contest.The380th.beautifulIndices100165;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> aIndex = new ArrayList<>();
        List<Integer> bIndex = new ArrayList<>();
        int start = 0;
        while (start < s.length()) {
            int i = s.indexOf(a, start);
            if (i != -1) {
                aIndex.add(i);
                start = i + a.length();
            } else {
                break;
            }
        }
        start = 0;
        while (start < s.length()) {
            int i = s.indexOf(b, start);
            if (i != -1) {
                bIndex.add(i);
                start = i + b.length();
            } else {
                break;
            }
        }
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < aIndex.size(); i++) {
            for (int j = 0; j < bIndex.size(); j++) {
                if (Math.abs(aIndex.get(i) - bIndex.get(j)) <= k) {
                    ans.add(aIndex.get(i));
                    break;
                }
            }
        }
        return ans;
    }
}