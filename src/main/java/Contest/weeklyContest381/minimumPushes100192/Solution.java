package Contest.weeklyContest381.minimumPushes100192;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort((o1, o2) -> o2 - o1);


        if (list.size() <= 8) {
            return word.length();
        }
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i) * ((i / 8) + 1);
        }
        return ans;

    }
}
