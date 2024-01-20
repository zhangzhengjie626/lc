package TopInterview150.Week6.rangeBitwiseAnd201;

/**
 * https://leetcode.cn/problems/bitwise-and-of-numbers-range/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            shift++;
            left = left >> 1;
            right = right >> 1;
        }
        while (shift != 0) {
            left = left << 1;
            shift--;
        }
        return left;
    }
}
