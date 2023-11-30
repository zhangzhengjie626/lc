package Week3.isHappy202;

import java.util.HashSet;
import java.util.Set;

/**
 * 202.快乐数
 */
public class Solution {
    public boolean isHappy(int n) {
        //按题目的方法肯定是做不出来的，无限循环，估计得找规律
        //没思路，拉倒
        //看了题解，居然会循环，牛的，编码倒是没啥东西，但是不一定找得到规律，以及一时半会不一定想的明白，不会无限增大，这个估计得证明下
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;

    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}
