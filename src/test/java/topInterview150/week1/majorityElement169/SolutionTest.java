package topInterview150.week1.majorityElement169;

import org.junit.Test;


public class SolutionTest {

    @Test
    public void majorityElement() {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3,2,3}));
        System.out.println(solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}