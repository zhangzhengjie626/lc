package TopInterview150.Week5.combine77;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/combinations/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nNum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nNum.add(i + 1);
        }
        List<String> res = new ArrayList<>();
        getAns(0, k, nNum, res, "");
        List<List<Integer>> resRes = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            String[] split = res.get(i).split(",");
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < split.length; j++) {
                tmp.add(Integer.parseInt(split[j]));
            }
            resRes.add(tmp);
        }
        return resRes;
    }

    private void getAns(int loc, int k, List<Integer> nNum, List<String> res, String cur) {
        if (!cur.isEmpty() && cur.split(",").length == k) {
            res.add(cur);
        } else {
            for (int i = loc; i < nNum.size(); i++) {
                getAns(i + 1, k, nNum, res, cur + nNum.get(i) + ",");
            }
        }
    }
}
//用什么来回溯？ arraylist不行  用了string加逗号分隔凑合用了
