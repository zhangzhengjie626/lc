package Week7.trap42;

/**
 * https://leetcode.cn/problems/trapping-rain-water/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int preMax = height[left];
        int sufMax = height[right];
        int ans = 0;
        while (left <= right) {
            if (preMax < sufMax) {
                //left=right 处的preMax需要计算
                //重复算了第一轮
                preMax = Math.max(preMax, height[left]);
                ans += preMax - height[left];
                left++;
            } else {
                sufMax = Math.max(sufMax, height[right]);
                ans += sufMax - height[right];
                right--;
            }
        }
        return ans;
    }


    public int trap1(int[] height) {
        int left = 0, right = height.length - 1;
        int preMax = height[left];
        int sufMax = height[right];
        int ans = 0;
        //第一轮已经算过了，确实比上面的方法少一轮
        while (left < right) {
            if (preMax < sufMax) {
                ans += preMax - height[left];
                left++;
                //left<=right在这里会越界成-1 ....
                preMax = Math.max(preMax, height[left]);
            } else {
                ans += sufMax - height[right];
                right--;
                sufMax = Math.max(sufMax, height[right]);
            }
        }
        return ans;
    }
}
