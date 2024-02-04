package topInterview150.week2.rotate189;

import org.junit.Test;

import java.util.Arrays;


public class SolutionTest {

    @Test
    public void rotate() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(solution.rotate(new int[]{-1,-100,3,99}, 2)));
        System.out.println(Arrays.toString(solution.rotate(new int[]{1,2}, 3)));
    }
}