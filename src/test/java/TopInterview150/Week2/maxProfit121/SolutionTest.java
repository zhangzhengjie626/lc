package TopInterview150.Week2.maxProfit121;

import TopInterview150.Week2.maxProfit121.Solution;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void maxProfit() {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}