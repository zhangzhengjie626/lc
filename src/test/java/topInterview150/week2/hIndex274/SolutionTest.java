package topInterview150.week2.hIndex274;

import org.junit.Test;


public class SolutionTest {

    @Test
    public void hIndex() {
        Solution solution = new Solution();
        System.out.println(solution.hIndex(new int[]{3,0,6,1,5}));
        System.out.println(solution.hIndex(new int[]{1,3,1}));
    }
}