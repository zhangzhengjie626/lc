package Week3.jump45;

import TopInterview150.Week3.jump45.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void jump() {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{2,3,1,1,4}));
        System.out.println(solution.jump(new int[]{2,3,0,1,4}));
    }
}