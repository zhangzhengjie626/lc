package topInterview150.week6.findMinArrowShots452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int m = points.length;
        int res = 0;
        int left, right;
        for (int i = 0; i < m; i++) {
            left = points[i][0];
            right = points[i][1];
            while (i + 1 < m && points[i + 1][0] <= right) {
                //区间重叠
                //更新left right
                right = Math.min(points[i + 1][1], right);
                left = Math.max(points[i + 1][0], left);
                i++;
            }
            //区间不重叠
            res++;
        }
        return res;
    }
}
//i=0开始，否则全部不重叠的时候会差1