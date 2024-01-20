package Week5.singleNumber137;

import TopInterview150.Week5.singleNumber137.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void singleNumber() {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{2, 2, 2, 3}));
        System.out.println(solution.singleNumber(new int[]{30000,500,100,30000,100,30000,100}));
        System.out.println(solution.singleNumber(new int[]{-2,-2,1,1,4,1,4,4,-4,-2}));
    }
}