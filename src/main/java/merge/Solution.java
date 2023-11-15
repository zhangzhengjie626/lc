package merge;

/**
 * 88. 合并两个有序数组
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //我的思路：直接在nums1里替换，被替换的数就一个，可以临时保存在变量中，但是后面的数怎么往后移呢？（10min 想不明白咋整合适）
        //看了题解，从后往前，，，没做过一时半会没反应出来，从后往前的话，显然元素不会被覆盖
        //从后往前的哲学
        if (n == 0) return;
        int i = 0, j = 0;
        while (m > i && n > j) {
            if (nums2[j] >= nums1[i]) {
                i++;
            } else {
                //i到m+n-1往后
                for (int k = i; k < m + n - 1; k++) {
                    nums1[k + 1] = nums1[k];
                }
                nums1[i] = nums2[j];
                j++;
            }
        }
        if (n > j) {
            for (int k = n - j - 1, l = 0; k < n; k++, l++) {
                nums1[m + j + l] = nums2[k];
            }
        }


    }
}