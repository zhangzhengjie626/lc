package topInterview150.week4.mySqrt69;

/**
 * 69.x的平方根
 */
public class Solution {
    public int mySqrt(int x) {
        long xl = x;

        if (x == 1 || x == 2) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        for (long i = 1; i < x; i++) {
            if (i * i > x) {
                return (int) (i - 1);
            }
        }
        return 0;
    }
}
//寄1 特例 0和1  2
//寄2 int越界了
//看题解