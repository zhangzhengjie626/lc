package topInterview150.week5.letterCombinations17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.cn/problems/letter-combinations-of-a-phone-number/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        ArrayList<String> ans = new ArrayList<>();
        getAns(digits, ans, "", 0, map);
        return ans;
    }

    private void getAns(String digits, ArrayList<String> ans, String cur, int length, HashMap<Integer, String> map) {
        if (digits.isEmpty()) {
            return;
        }
        if (length == digits.length()) {
            ans.add(cur);
        } else {
            String s = map.get(Integer.parseInt(digits.charAt(length) + ""));
            for (int i = 0; i < s.length(); i++) {

                getAns(digits, ans, cur + s.charAt(i), length + 1, map);
            }
        }
    }
}
//过了，但是性能又不行，看题解吧...