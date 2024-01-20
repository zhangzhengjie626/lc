package TopInterview150.Week5.trailingZeroes172;

/*
https://leetcode.cn/problems/factorial-trailing-zeroes/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int trailingZeroes(int n) {
        int twoNum = 0;
        int fiveNum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp1 = i, tmp2 = i;

            while (tmp1 % 5 == 0) {
                fiveNum++;
                tmp1 /= 5;
            }
            while (tmp2 % 2 == 0) {
                twoNum++;
                tmp2 /= 2;
            }
        }
        return Math.min(fiveNum, twoNum);
    }
}
//难道阶乘可以不需要遍历？ 效率低了点尬住了