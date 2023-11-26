package Week1.removeElement27;

/**
 * 27. 移除元素
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        //我的思路：尾指针指最后，遇到需要移除的元素就和尾指针交换，然后尾指针往前移一位
        //寄1：直接和末尾换还不行，末尾的可能也是要移除的元素，需要调整下index
        //ok
        int tail = nums.length - 1;
        for (int i = 0; i <= tail; i++) {
            if (nums[i] == val) {
                int tmp = nums[tail];
                nums[tail] = nums[i];
                nums[i] = tmp;
                tail--;
                i--;
            }
        }
        return tail + 1;
    }
}