package topInterview150.week5.insert57;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/insert-interval/submissions/493720835/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //加进去简单写一下算了，不加进去，估计还一堆特例要处理
        int[][] newIntervals = new int[intervals.length + 1][];
        for (int i = 0; i < intervals.length; i++) {
            newIntervals[i] = intervals[i];
        }
        newIntervals[intervals.length] = newInterval;
        quickSort(0, newIntervals.length, newIntervals);

        List<int[]> res = new ArrayList<>();
        int i = 0;
        //边界条件问题，最后一个的时候，可以不走while条件
        while (i < newIntervals.length) {
            int left = newIntervals[i][0];
            int right = newIntervals[i][1];
            //边界条件问题
            while (i < newIntervals.length - 1 && newIntervals[i + 1][0] <= right) {
                right = Math.max(right, newIntervals[i + 1][1]);
                i++;
            }
            res.add(new int[]{left, right});
            i++;
        }
        int[][] resRes = new int[res.size()][];
        for (int j = 0; j < res.size(); j++) {
            resRes[j] = res.get(j);
        }
        return resRes;
    }


    private void quickSort(int left, int right, int[][] intervals) {
        if (left < right) {
            //自己排一下
            int loc = left;
            //从left+1开始
            for (int i = left + 1; i < right; i++) {
                if (intervals[i][0] < intervals[loc][0]) {
                    loc++;
                    //交换
                    int tmp0 = intervals[i][0];
                    intervals[i][0] = intervals[loc][0];
                    intervals[loc][0] = tmp0;

                    int tmp1 = intervals[i][1];
                    intervals[i][1] = intervals[loc][1];
                    intervals[loc][1] = tmp1;

                }
            }
            //
            int tmp0 = intervals[left][0];
            intervals[left][0] = intervals[loc][0];
            intervals[loc][0] = tmp0;

            int tmp1 = intervals[left][1];
            intervals[left][1] = intervals[loc][1];
            intervals[loc][1] = tmp1;

            //左边排一下
            quickSort(left, loc, intervals);
            //右边排一下
            quickSort(loc + 1, right, intervals);
        }
    }
}
//如果不换 loc就是最小值，如果换了，loc还是最小值，统一了，和之前换+1，不换是原地两种情况区别开来