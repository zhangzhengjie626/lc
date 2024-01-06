package Week5.permute46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] tag = new boolean[nums.length];
        Arrays.fill(tag, true);
        List<String> resString = new ArrayList<>();

        getAns(tag, "", nums, resString);

        for (int i = 0; i < resString.size(); i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            String s = resString.get(i);
            String[] split = s.split(",");
            for (int j = 0; j < split.length; j++) {
                tmp.add(Integer.parseInt(split[j]));
            }
            res.add(tmp);
        }
        return res;
    }

    private void getAns(boolean[] tag, String curRes, int[] nums, List<String> resString) {
        boolean all = true;
        for (int i = 0; i < tag.length; i++) {
            if (tag[i]) {
                all = false;
                break;
            }
        }
        if (all) {
            resString.add(curRes);
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tag[i]) {
                    tag[i] = false;
                    getAns(tag, curRes + nums[i] + ",", nums, resString);
                    tag[i] = true;
                }
            }
        }
    }
}
//看题解吧，效率太低了

