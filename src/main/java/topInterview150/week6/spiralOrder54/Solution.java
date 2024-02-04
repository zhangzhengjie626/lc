package topInterview150.week6.spiralOrder54;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.cn/problems/spiral-matrix/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0, buttom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (true) {
            //左到右
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            //往下压
            top++;
            if (top > buttom) {
                break;
            }
            //上到下
            for (int i = top; i <= buttom; i++) {
                ans.add(matrix[i][right]);
            }
            //往左压
            right--;
            if (right < left) {
                break;
            }
            //右到左
            for (int i = right; i >= left; i--) {
                ans.add(matrix[buttom][i]);
            }
            //往上压
            buttom--;
            if (buttom < top) {
                break;
            }
            //下到上
            for (int i = buttom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            //往右压
            left++;
            if (left > right) {
                break;
            }
        }
        return ans;
    }
}
//i的边界条件