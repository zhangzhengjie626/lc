package topInterview150.week4.reverseBits190;

/**
 * 190.颠倒二进制位
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i = 31;
        int rev = 0;
        while (i >= 0) {
            //(n & 1）取最低位   1001 & 0001 = 0001
            rev |= (n & 1) << i;
            n = n >>> 1;//逻辑右移，注意一下
            i--;
        }
        return rev;
    }
}