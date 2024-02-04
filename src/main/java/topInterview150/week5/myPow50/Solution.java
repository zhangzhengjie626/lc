package topInterview150.week5.myPow50;

/**
 * https://leetcode.cn/problems/powx-n/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return getMyPow(x, n);
        } else {
            return 1.0 / getMyPow(x, -1*(long)n);
        }
    }

    private double getMyPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            double v = getMyPow(x, n / 2);
            return v * v;
        } else {
            double v = getMyPow(x, (n - 1) / 2);
            return v * v * x;
        }
    }
}
//-2147483648转正数后超int范围的问题