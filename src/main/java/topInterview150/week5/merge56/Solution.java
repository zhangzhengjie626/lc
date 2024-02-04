package topInterview150.week5.merge56;

import java.util.ArrayList;

public class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        if (n == 1) {
            return intervals;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] < intervals[i][0]) {
                    //交换
                    int tmp0 = intervals[i][0];
                    intervals[i][0] = intervals[j][0];
                    intervals[j][0] = tmp0;

                    int tmp1 = intervals[i][1];
                    intervals[i][1] = intervals[j][1];
                    intervals[j][1] = tmp1;
                }

            }
        }
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        while (i < n - 1) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < n - 1 && intervals[i + 1][0] <= right) {
                right = Math.max(right, intervals[i + 1][1]);
                i++;//有点东西的
            }
            res.add(new int[]{left, right});
            i++;//到下一数
        }
        int[][] resRes = new int[res.size()][];
        for (int j = 0; j < res.size(); j++) {
            resRes[j] = res.get(j);
        }
        return resRes;
    }
}
//最后如何通过排序后的intervals，生成结果，需要想清楚下