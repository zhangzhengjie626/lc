package Contest.weeklyContest380.findMaximumNumber100160;

public class Solution {
    public long findMaximumNumber(long k, int x) {
        long x1 = getX(x);
        //模拟  or 找规律？
        long val = 0;
        for (long i = x; i < Long.MAX_VALUE; i++) {
            //计算每个数的价值
            long curVal = 0;
            //二进制位为1且位数%x=0
            long curNum = i;
            long tmp = curNum & x1;
            for (int j = 0; j < 64; j++) {
                curVal = curVal + ((tmp >> j) & 1);
            }
            val += curVal;
//            System.out.println("num:" + i + " curVal:" + curVal + " val:" + val);
            if (val > k) {
                i = i - 1;
                return i;
            }
        }
        return -1;
    }

    private long getX(int x) {
        long res = 0;
        for (int i = 0; i < 64; i++) {
            if ((i + 1) % x == 0) {
                long tmp = 1L << i;
                res |= tmp;
            }
        }
        return res;
    }
}

//超时了，果然要找规律
//不知道咋做，看一下最后一题题目，拉倒吧，水平就这样
