package topInterview150.week1.removeDuplicates80;

/**
 * 80. 删除有序数组中的重复项 II
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        //我的思路：尾指针记录长度，统计重复次数
        int tail = nums.length - 1, dupNum = 0;
        for (int i = 0; i <= tail - 1 ; i++) {
            if (nums[i + 1] == nums[i]) {
                dupNum++;
                if(dupNum >= 2){
                    //移动，重复的元素被覆盖不需要管
                    for (int j = i + 1; j <= nums.length - 1 ; j++) {
                        nums[j - 1] = nums[j];
                    }
                    //当前ans-1
                    tail--;
                    //排除一个重复元素后，重复元素数目-1
                    dupNum--;
                    //继续从当前位置判断
                    i--;
                }
            } else{
                dupNum = 0;
            }
        }
        return tail + 1;
    }
}