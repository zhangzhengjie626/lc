package TopInterview150.Week4.singleNumber136;

import TopInterview150.Week4.singleNumber136.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void singleNumber() {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{2, 2, 1}));
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(solution.singleNumber(new int[]{1}));
    }
}