package TopInterview150.Week2.productExceptSelf238;

import TopInterview150.Week2.productExceptSelf238.Solution;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void productExceptSelf() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}