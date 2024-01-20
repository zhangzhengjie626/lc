package Week7.canCompleteCircuit134;

import TopInterview150.Week7.canCompleteCircuit134.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void canCompleteCircuit() {
        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}