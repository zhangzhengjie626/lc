package topInterview150.week8.minimumTotal120;

import java.util.List;

/**
 * https://leetcode.cn/problems/triangle/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] ans = new int[triangle.size()];
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        //先把第一层放进去
        ans[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            ans[i] = ans[i - 1] + triangle.get(i).get(i);

            for (int j = i - 1; j >= 1; j--) {
                ans[j] = Math.min(ans[j], ans[j - 1]) + triangle.get(i).get(j);
            }
            ans[0] = ans[0] + triangle.get(i).get(0);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < ans.length; i++) {
            res = Math.min(res, ans[i]);
        }
        return res;
    }
}
//从前往后更新覆盖住上一轮的值了,需要从后往前更新，原地更新的时候，注意覆盖的问题