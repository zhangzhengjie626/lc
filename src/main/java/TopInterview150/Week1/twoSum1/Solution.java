package TopInterview150.Week1.twoSum1;

import java.util.HashMap;

/***
 * 1. 两数之和
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //我的思路：
        // 1.转升序数组，固定第一个加数，往后找第二个加数，遇到两数和大于target的，第一个加数位置往后移（未实现）
        // 2.转map,
        // -2.1 遇到值相同的时候，map记录的是后面的数的位置，由于答案唯一性，不影响
        // -2.2 遇到值相同的时候，如3，3构成答案，map记录的是后面的数的位置，扫的时候是从前面扫，因此没影响，
        // 有影响的是只有一个3的时候，因此需要判断i != map.get(target - nums[i])
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return  new int[]{i, map.get(target - nums[i])};
            }
        }
        return new int[]{0, 0};
    }
}