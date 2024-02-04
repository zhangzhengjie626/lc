package topInterview150.week4.plusOne66;

/**
 * 66.加一
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans;
        boolean up = true;
        for (int i = digits.length - 1; up && i >= 0; i--) {
            up = false;
            digits[i] += 1;
            if (digits[i] == 10) {
                digits[i] = 0;
                up = true;
            }
        }
        if (up) {
            ans = new int[digits.length + 1];
            ans[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                ans[i + 1] = digits[i];
            }
        } else {
            ans = digits;
        }
        return ans;
    }
}