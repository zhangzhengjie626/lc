package Week1.removeDuplicates80;

import TopInterview150.Week1.removeDuplicates80.Solution;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void removeDuplicates() {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));

    }
}