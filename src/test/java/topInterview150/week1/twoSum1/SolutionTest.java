package topInterview150.week1.twoSum1;

import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void twoSum() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,3}, 6)));
    }
}