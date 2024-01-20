package TopInterview150.Week1.removeDuplicates26;

/**
 * 26. 删除有序数组中的重复项
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        //我的思路，删除的元素用一个尾指针放在最后，其他的靠近空位的开始移动
        int tail = nums.length - 1;
        for (int i = 1; i <= tail; i++) {
            if (nums[i] == nums[i - 1]) {
                //临时保存
                int tmp = nums[i];
                //i + 1 , tail 开始移动到 i , tail - 1 的位置
                for (int j = i; j <=  tail - 1 ; j++) {
                    nums[j] = nums[j + 1];
                }
                //nums[i] 交换到尾部
                nums[tail] = tmp;
                tail--;
                //当前元素继续判断是否和前一个重复
                i--;
            }
        }
        return tail + 1;
    }
    //寄1：i + 1 , tail 开始移动到 i , tail - 1 的位置  角标问题
}
