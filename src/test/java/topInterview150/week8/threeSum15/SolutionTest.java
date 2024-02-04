package topInterview150.week8.threeSum15;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void threeSum() {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(solution.threeSum(new int[]{0, 1, 1}));
        System.out.println(solution.threeSum(new int[]{0, 0, 0}));
        System.out.println(solution.threeSum(new int[]{-2, 0, 0, 2, 2}));
    }
}