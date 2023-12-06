package Week4.summaryRanges228;

import java.util.ArrayList;
import java.util.List;

/**
 * 228.汇总区间
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        } else if (nums.length == 1) {
            ans.add("" + nums[0]);
            return ans;
        } else {
            int[] newNums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                newNums[i] = nums[i];
            }
            newNums[newNums.length - 1] = nums[nums.length - 1];
            String tmp = "" + nums[0];
            boolean arrow = false;
            for (int i = 1; i < newNums.length; i++) {
                if (newNums[i] == newNums[i - 1] + 1) {
                    arrow = true;
                } else {
                    //拼接
                    if (arrow) {
                        tmp = tmp + "->" + newNums[i - 1];
                    }
                    ans.add(tmp);
                    tmp = "" + newNums[i];
                    arrow = false;
                }
            }
        }
        return ans;
    }
}
//停止条件看题解吧，我这个加了额外空间，不太好
//寄1 []特例条件代码顺序问题