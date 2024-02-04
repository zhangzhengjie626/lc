package topInterview150.week4.isPalindrome9;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 9.回文数
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        } else {
            ArrayList<Integer> tmp = new ArrayList<>();
            while (x > 0) {
                int i = x % 10;
                x /= 10;
                tmp.add(i);
            }

            Integer[] array = tmp.toArray(new Integer[0]);
            int left = 0, right = array.length - 1;
            while (left < right) {
                if (!Objects.equals(array[left], array[right])) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
//看题解