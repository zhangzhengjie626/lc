package maxProfit121;

import org.junit.Test;


public class SolutionTest {

    @Test
    public void maxProfit() {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}