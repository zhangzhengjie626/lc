package TopInterview150.Week7.canCompleteCircuit134;

/**
 * https://leetcode.cn/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        boolean[] startVisited = new boolean[gas.length];
        int start = 0;
        startVisited[0] = true;
        int res = 0;
        for (int i = 0; i <= gas.length; i++) {
            res = gas[(start + i) % gas.length] + res - cost[(start + i) % gas.length];
            if (res < 0) {
                int lastStart = start;
                while (startVisited[start]) {
                    start = (start + i + 1) % gas.length;
                    if (lastStart == start) {
                        break;
                    }
                }
                startVisited[start] = true;
                if (lastStart == start) {
                    return -1;
                }
                res = 0;//重新开始，res=0
                i = -1;//下次会自动+1，为了回到0，需要设置-1
            }
            if (i == gas.length) {
                return start;
            }
        }
        return -1;
    }
}
//如果从start 到end开不到，那么以start+1,start+2,end-1为起点，都开不到end，下一次选取起点需要从end+1开始
//因为start+1,start+2 res>=0, 要么和start的情况一样res=0，要么res>0，都开不到end