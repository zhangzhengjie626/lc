package merge88;

/**
 * 88. 合并两个有序数组
 */
public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //我的思路：直接在nums1里替换，后面的数直接后移，给被替换的数空位置
        //看了题解，从后往前，，，没做过一时半会没反应出来，从后往前的话，显然元素不会被覆盖
        //从后往前的哲学
        if (n == 0) return nums1;
        int i = 0, j = 0;
        while (i <= m - 1 && j <= n - 1) {
            if (nums2[j] >= nums1[i + j]) {
                i++;
            } else {
                //i+j 到m+n-1往后移, 往后移得从后往前往后移，从前往后后边的元素被覆盖了，寄
                for (int k = m + n - 2; k >= i + j; k--) {
                    nums1[k + 1] = nums1[k];
                }
                nums1[i + j] = nums2[j];
                j++;
            }
        }
        //如果nums2插入后，还有剩余，直接全拼到尾部
        if (j <= n - 1) {
            for (int k = j, l = 0; k < n; k++, l++) {
                nums1[i + j + l] = nums2[k];
            }
        }
        return nums1;
    }
}