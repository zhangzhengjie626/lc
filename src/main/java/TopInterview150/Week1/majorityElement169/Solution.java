package TopInterview150.Week1.majorityElement169;

import java.util.HashMap;
import java.util.Map;

/**
 * 169.多数元素
 */
public class Solution {
    public int majorityElement(int[] nums) {
        //我的思路：把数目存下来，比较
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > Math.floor(nums.length / 2.0)) {
                return e.getKey();
            }
        }
        return -1;
    }
}