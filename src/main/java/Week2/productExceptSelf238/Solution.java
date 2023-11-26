package Week2.productExceptSelf238;

/**
 * 238.除自身以外数组的乘积
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        //我的思路：左乘一圈，右乘一圈
        //左往右乘，放ans里，右往左乘，再乘ans就是答案
        int lMul = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = lMul;
            lMul *= nums[i];
        }
        int rMul = 1;
        for (int i = nums.length - 1; i >=0 ; i--) {
            ans[i] = rMul * ans[i];
            rMul *= nums[i];
        }
        return ans;
    }
}