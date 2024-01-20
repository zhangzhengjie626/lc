package TopInterview150.Week2.canJump55;

import TopInterview150.Week2.canJump55.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void canJump() {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{2,3,1,1,4}));
        System.out.println(solution.canJump(new int[]{3,2,1,0,4}));
    }
}