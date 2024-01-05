package Week5.singleNumber137;

/*
https://leetcode.cn/problems/single-number-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        int op = 1;
        for (int i = 0; i < 32; i++) {
            int i1 = op << i;
            int i2 = 0;
            for (int j = 0; j < nums.length; j++) {
                i2 += (nums[j] & i1)>>i;
                //|是位运算，无法累加到3，需要用+号
            }
            if (i2 % 3 != 0) {
                res |= i1;
            }
        }
        return res;
    }
}
//取余的时候需要累加无法使用|