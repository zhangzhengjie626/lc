package topInterview150.week6.convert6;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuffer> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(new StringBuffer());
        }
        int direction = -1;
        int i = 1;
        for (Character c : s.toCharArray()) {
            i += direction;
            res.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                direction = -direction;
            }
        }
        String resStr = "";
        for (int j = 0; j < res.size(); j++) {
            resStr += res.get(j).toString();
        }
        return resStr;
    }
}
//一行的特例 "AB" 1
//遇到0就反向，所以direction一开始是-1，为了第一个是0，所以i=1开始
//初始化的条件，有点巧妙