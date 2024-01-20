package TopInterview150.Week4.hammingWeight191;

/**
 * 191.位1的个数
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0, i = 31;
        //输入长度控制了32位，和int位数一样
        while (i >= 0) {
            //(n & 1)取最低位  e.g. 1111 & 0001 = 0001
            if ((n & 1) == 1) {
                res++;
            }
            n = n >>> 1;//移动更新最低位
            i--;
        }
        return res;
    }
}