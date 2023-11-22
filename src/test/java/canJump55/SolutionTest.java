package canJump55;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canJump() {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{2,3,1,1,4}));
        System.out.println(solution.canJump(new int[]{3,2,1,0,4}));
    }
}