package Week7.trap42;

/**
 * https://leetcode.cn/problems/trapping-rain-water/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        //初始化为0
        int preMax = 0;
        int sufMax = 0;
        int ans = 0;
        //i-1,i,i+1实际上算的是i左边最大的，i右边最大的，所以left==right的时候左右都是自己已经没有东西了，怎么算都是是0了
        while (left <= right) {
            //进来先更新preMax sufMax
            preMax = Math.max(preMax, height[left]);
            sufMax = Math.max(sufMax, height[right]);
            if (preMax < sufMax) {
                ans += preMax - height[left];
                left++;
            } else {
                ans += sufMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
//left==right的时候，实际是到了最高点，或者相对最高点，导致当前ans一定是0
