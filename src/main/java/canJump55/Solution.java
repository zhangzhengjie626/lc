package canJump55;

/**
 * 55.跳跃游戏
 */
public class Solution {
    public boolean canJump(int[] nums) {
        //我的思路：最大长度，看错题了，，递归
        //需要让某个递归到正确结果的值，一直往上传，不是中间就断了。
        //还得看题解啊
        //寄：递归超出时间限制了

        return nextJump(0, nums);
        //想了下，是不是得从后往前啊，试一下，想不清楚怎么处理
    }

    private boolean nextJump(int curLoc, int[] nums) {
        if (curLoc == nums.length - 1) {
            return true;
        }
        for (int i = 1; i <= nums[curLoc]; i++) {
            if (nextJump(curLoc + i, nums)) {
                return true;
            }
            if (i == nums[curLoc]) {
                return false;
            }
        }
        return false;
    }
}

