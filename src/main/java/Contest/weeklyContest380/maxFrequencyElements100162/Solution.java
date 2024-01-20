package Contest.weeklyContest380.maxFrequencyElements100162;

import java.util.*;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> fre = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (fre.containsKey(nums[i])) {
                fre.put(nums[i], fre.get(nums[i]) + 1);
            } else {
                fre.put(nums[i], 1);
            }
        }
        List<Integer> values = new ArrayList<>(fre.values());
        int maxFre = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            maxFre = Math.max(maxFre, values.get(i));
        }
        HashSet<Integer> numsSet = new HashSet<>();
        int ans = 0;

        for (Map.Entry<Integer, Integer> e : fre.entrySet()) {
            if (e.getValue() == maxFre) {
                numsSet.add(e.getKey());
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                ans++;
            }
        }
        return ans;
    }
}